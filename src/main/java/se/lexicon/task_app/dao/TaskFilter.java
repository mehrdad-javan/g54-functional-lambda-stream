package se.lexicon.task_app.dao;

import se.lexicon.task_app.model.Task;

@FunctionalInterface
public interface TaskFilter {

    boolean matches(Task task);
}
