package com.astronaut.observer;

import com.astronaut.models.Task;

public interface TaskNotifier {
    void notifyConflict(Task existing, Task newTask);
}
