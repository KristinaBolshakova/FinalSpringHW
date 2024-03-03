package com.example.FinalSpringHW.controller;

import com.example.FinalSpringHW.domain.Task;
import com.example.FinalSpringHW.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @PostMapping("/tasks")
    public void createTask(@RequestBody Task task){
        taskService.addTask(task);
    }
}
