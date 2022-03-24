package com.yaman.spring.mvc_hibernate_aop.dao;

import com.yaman.spring.mvc_hibernate_aop.entity.Task;

import java.util.List;

public interface TaskDAO {
    List<Task> getAllTasks();

    void saveTask(Task task);

    Task getTask(Long taskId);

    void deleteTask(Long taskId);
}
