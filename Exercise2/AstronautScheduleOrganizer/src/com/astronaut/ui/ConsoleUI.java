package com.astronaut.ui;

import com.astronaut.factory.TaskFactory;
import com.astronaut.manager.ScheduleManager;
import com.astronaut.models.Task;
import com.astronaut.observer.ConsoleNotifier;
import com.astronaut.observer.TaskNotifier;
import com.astronaut.utils.TimeUtils;

import java.util.*;

public class ConsoleUI {

    private ScheduleManager manager;
    private TaskNotifier notifier;
    private Scanner sc;

    public ConsoleUI() {
        manager = ScheduleManager.getInstance();
        notifier = new ConsoleNotifier();
        sc = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n--- Astronaut Daily Schedule ---");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1: addTaskUI(); break;
                case 2: removeTaskUI(); break;
                case 3: viewTasksUI(); break;
                case 4: System.exit(0);
                default: System.out.println("Invalid choice.");
            }
        }
    }

    private void addTaskUI() {
        System.out.print("Description: "); 
        String desc = sc.nextLine();
        System.out.print("Start Time (HH:mm or HHmm): "); 
        String start = sc.nextLine();
        System.out.print("End Time (HH:mm or HHmm): "); 
        String end = sc.nextLine();
        System.out.print("Priority (High/Medium/Low): "); 
        String priority = sc.nextLine();

        if (!TimeUtils.isValidTime(start) || !TimeUtils.isValidTime(end)) {
            System.out.println("Invalid time format."); 
            return;
        }

        Task task = TaskFactory.createTask(desc, start, end, priority);

        for (Task t : manager.getTasks()) {
            if (TimeUtils.isOverlap(t.getStartTime(), t.getEndTime(), task.getStartTime(), task.getEndTime())) {
                notifier.notifyConflict(t, task);
                return;
            }
        }

        manager.addTask(task);
        System.out.println("Task added successfully.");
    }

    private void removeTaskUI() {
        System.out.print("Enter task description: ");
        String input = sc.nextLine().trim();

        String description = parseDescription(input);

        List<Task> matches = new ArrayList<>();
        for (Task t : manager.getTasks()) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                matches.add(t);
            }
        }

        if (matches.isEmpty()) {
            System.out.println("Task \"" + description + "\" not found.");
            return;
        }

        // If only one match → delete directly
       if (matches.size() == 1) {
         manager.removeTask(matches.get(0));   
    System.out.println("Task \"" + description + "\" removed successfully!");
    return;
}


        // Multiple matches → let user choose
        System.out.println("Multiple tasks found with description \"" + description + "\":");
        for (int i = 0; i < matches.size(); i++) {
            Task t = matches.get(i);
            System.out.println((i + 1) + ". " + t.getStartTime() + " - " + t.getEndTime()
                    + " [" + t.getPriority() + "]");
        }

        System.out.print("Enter the number of the task to delete: ");
        int choice = sc.nextInt(); sc.nextLine();

       if (choice >= 1 && choice <= matches.size()) {
    Task toRemove = matches.get(choice - 1);
    manager.removeTask(toRemove);   
    System.out.println("Task \"" + toRemove.getDescription() + "\" removed successfully!");
} else {
    System.out.println("Invalid choice. No task removed.");
}

    }

    private String parseDescription(String input) {
        String desc = input;

        if (desc.toLowerCase().startsWith("remove task(")) {
            int start = desc.indexOf("(") + 1;
            int end = desc.lastIndexOf(")");
            if (start > 0 && end > start) {
                desc = desc.substring(start, end).replace("\"", "").trim();
            }
        }

        if (desc.startsWith("\"") && desc.endsWith("\"")) {
            desc = desc.substring(1, desc.length() - 1).trim();
        }

        return desc;
    }

    private void viewTasksUI() {
        if (manager.getTasks().isEmpty()) {
            System.out.println("No tasks scheduled.");
        } else {
            manager.getTasks().forEach(System.out::println);
        }
    }
}
