package se.lexicon;

import se.lexicon.task_app.dao.TaskAction;
import se.lexicon.task_app.dao.TaskDao;
import se.lexicon.task_app.dao.TaskFilter;
import se.lexicon.task_app.model.Task;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        TaskDao taskDao = new TaskDao();

        // Scenario 1: Print titles of tasks that are not completed
        TaskFilter notCompleted = task -> !task.isCompleted();
        TaskAction printTitle = task -> System.out.println(task.getTitle());
        taskDao.processTasks(notCompleted, printTitle); // ?

        // Scenario 2: Print all tasks with high priority (priority >= 4)
        taskDao.processTasks(
                task -> task.getPriority() >= 4,
                task -> System.out.println(task.toString()));

        // Scenario 3: Mark tasks with priority > 3 as completed
        taskDao.processTasks(
                task -> task.getPriority() > 3,
                task -> task.setCompleted(true));

        System.out.println("---------------------");
        Consumer<Task> printTaskTitle = t -> System.out.println(t.getTitle());
        Consumer<Task> printTaskDescription = t -> System.out.println(t);
        taskDao.getTasks().forEach(printTaskTitle);

    }
}