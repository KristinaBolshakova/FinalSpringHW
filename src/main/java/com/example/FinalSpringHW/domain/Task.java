package com.example.FinalSpringHW.domain;

import lombok.Data;

@Data
public class Task {
    private Long id;
    private String name;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static class Builder {
        private final Task task;

        public Builder(Task task) {
            this.task = task;
        }

        public Builder id(Long id){
            task.setId(id);
            return this;
        }

        public Builder name(String name) {
            task.setName(name);
            return this;
        }

        public Builder description(String description) {
            task.setDescription(description);
            return this;
        }

        public Task build() {
            return task;
        }

    }


}
