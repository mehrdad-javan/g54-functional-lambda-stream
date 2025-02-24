package se.lexicon.task_app.dao;

import se.lexicon.task_app.model.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskDao {

    private List<Task> tasks = new ArrayList<>();

    public TaskDao() {
        initializeTasks();
    }

    private void initializeTasks() {
        tasks.addAll(Arrays.asList(
                new Task("Implement Login System", "Develop authentication and authorization functionality", false, 4),
                new Task("Fix NullPointerException", "Resolve null pointer issue in the payment module", false, 3),
                new Task("Write Unit Tests", "Create test cases for the User Service", true, 2),
                new Task("Optimize Database Queries", "Improve query performance for analytics reports", false, 5),
                new Task("Build REST API", "Design and implement RESTful APIs for the product module", false, 4),
                new Task("Refactor Code", "Clean up legacy code for better maintainability", true, 3),
                new Task("Setup CI/CD Pipeline", "Configure automated build and deployment", false, 5),
                new Task("Document API Endpoints", "Create API documentation for developers", false, 2),
                new Task("Fix UI Bugs", "Resolve alignment and responsiveness issues in the frontend", false, 3),
                new Task("Migrate Database", "Move data to the new database schema", true, 4)
        ));
    }

    // implement methods to manipulate tasks
   public void processTasks(TaskFilter filter, TaskAction action){
        for (Task task : tasks ){
            if (filter.matches(task)){
                action.perform(task);
            }
        }
   }

   public List<Task> getTasks(){
        return new ArrayList<>(tasks);
   }

}
