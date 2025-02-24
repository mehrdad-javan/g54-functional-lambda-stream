package se.lexicon.task_app.dao;

import se.lexicon.task_app.model.Task;

@FunctionalInterface
public interface TaskAction {
    void perform(Task task);

}
