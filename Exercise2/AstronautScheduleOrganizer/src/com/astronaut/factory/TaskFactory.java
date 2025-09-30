package com.astronaut.factory;

import com.astronaut.models.Task;

public class TaskFactory {
    public static Task createTask(String description, String startTime, String endTime, String priority) {
        return new Task(description, startTime, endTime, priority);
    }
}
