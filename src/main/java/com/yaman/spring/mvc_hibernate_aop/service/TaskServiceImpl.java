package com.yaman.spring.mvc_hibernate_aop.service;

import com.yaman.spring.mvc_hibernate_aop.dao.TaskDAO;
import com.yaman.spring.mvc_hibernate_aop.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskDAO taskDAO;

    @Override
    @Transactional
    public List<Task> getAllTasks() {
        return taskDAO.getAllTasks();
    }

    @Override
    @Transactional
    public void saveTask(Task task) {
        taskDAO.saveTask(task);
    }

    @Override
    @Transactional
    public Task getTask(Long taskId) {
        return taskDAO.getTask(taskId);
    }

    @Override
    @Transactional
    public void deleteTask(Long taskId) {
        taskDAO.deleteTask(taskId);
    }


}
