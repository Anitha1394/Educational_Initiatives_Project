package com.astronaut.observer;

import com.astronaut.models.Task;

public class ConsoleNotifier implements TaskNotifier {
    @Override
    public void notifyConflict(Task existing, Task newTask) {
        System.out.println("Conflict detected: \"" + newTask.getDescription() +
                "\" overlaps with \"" + existing.getDescription() + "\".");
    }
}
