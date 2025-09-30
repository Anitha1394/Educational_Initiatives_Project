package com.astronaut.manager;

import com.astronaut.models.Task;
import com.astronaut.utils.TimeUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ScheduleManager {

    private static ScheduleManager instance; // single instance
    private List<Task> tasks;

    private ScheduleManager() {  // private constructor
        tasks = new ArrayList<>();
    }

    // public method to get the single instance
    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public boolean addTask(Task task) {
        for (Task t : tasks) {
            if (TimeUtils.isOverlap(t.getStartTime(), t.getEndTime(), task.getStartTime(), task.getEndTime())) {
                return false;
            }
        }
        tasks.add(task);
        tasks.sort(Comparator.comparing(Task::getStartTime));
        return true;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public boolean removeTask(Task task) {
        return tasks.remove(task);
    }

    public List<Task> findTasksByName(String name) {
        List<Task> result = new ArrayList<>();
        for (Task t : tasks) {
            if (t.getDescription().toLowerCase().contains(name.toLowerCase())) {
                result.add(t);
            }
        }
        return result;
    }
}
