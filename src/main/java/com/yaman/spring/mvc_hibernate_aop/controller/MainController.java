package com.yaman.spring.mvc_hibernate_aop.controller;

import com.yaman.spring.mvc_hibernate_aop.entity.Task;
import com.yaman.spring.mvc_hibernate_aop.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private TaskService taskService;

    @GetMapping(name = "/")
    public String showAllTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks",tasks);
        return "all-tasks";
    }

    @GetMapping(value = "/addNewTask")
    public String addNewTask(Model model) {
        Task task = new Task();
        model.addAttribute("task",task);
        return "task-info";
    }

    @PostMapping(value = "/saveTask")
    public String saveTask(@ModelAttribute("task") Task task) {
        taskService.saveTask(task);
        return "redirect:/";
    }

    @GetMapping("/updateTask")
    public String updateTask(@RequestParam("taskId") Long taskId, Model model) {
        Task task = taskService.getTask(taskId);
        model.addAttribute("task",task);
        return "task-info";
    }

    @GetMapping("/deleteTask")
    public String deleteTask(@RequestParam("taskId") Long taskId, Model model) {
        taskService.deleteTask(taskId);
        return "redirect:/";
    }
}
