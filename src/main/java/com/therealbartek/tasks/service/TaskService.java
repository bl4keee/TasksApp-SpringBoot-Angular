package com.therealbartek.tasks.service;

import com.therealbartek.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
