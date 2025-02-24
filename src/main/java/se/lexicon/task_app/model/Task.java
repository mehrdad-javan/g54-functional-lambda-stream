package se.lexicon.task_app.model;

public class Task {
    private String title;
    private String description;
    private boolean isCompleted;
    private int priority;

    // Constructor
    public Task(String title, String description, boolean isCompleted, int priority) {
        this.title = title;
        this.description = description;
        this.isCompleted = isCompleted;
        this.priority = priority;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task{title='" + title + "', description='" + description + "', isCompleted=" + isCompleted + ", priority=" + priority + "}";
    }
}
