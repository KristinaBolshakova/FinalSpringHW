package com.example.FinalSpringHW.service;

import com.example.FinalSpringHW.domain.Task;

import java.util.List;

public interface iTaskService {
    List<Task> getAllTasks();

    Task createTask(Task task);

    Task getTaskById(Long id);

    Task updateTask(Long id, Task task);

    void deleteTask(Long id);

    void addTask(Task task);

}
