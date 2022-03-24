package com.yaman.spring.mvc_hibernate_aop.service;

import com.yaman.spring.mvc_hibernate_aop.entity.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();

    void saveTask(Task task);

    Task getTask(Long taskId);

    void deleteTask(Long taskId);
}
