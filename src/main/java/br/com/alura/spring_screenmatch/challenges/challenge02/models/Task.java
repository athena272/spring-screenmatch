package br.com.alura.spring_screenmatch.challenges.challenge02.models;

public class Task {
    private String description;
    private boolean completed;
    private String responsiblePerson;

    public Task() {}

    public Task(String description, boolean completed, String responsiblePerson) {
        this.description = description;
        this.completed = completed;
        this.responsiblePerson = responsiblePerson;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", completed=" + completed +
                ", responsiblePerson='" + responsiblePerson + '\'' +
                '}';
    }
}
