package dto.todolist;

import java.util.Optional;

public class Task implements Comparable<Task>{
  private String name;
  private String description;
  private Priority priority;

  public Task(String name, String description, Priority priority) {
    this.name = name;
    this.description = description;
    this.priority = priority;
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

  public Priority getPriority() {
    return priority;
  }

  public void setPriority(Priority priority) {
    this.priority = priority;
  }

  @Override
  public String toString() {
    return "Task{" +
            "name='" + name + '\'' +
            ", description=" + description +
            ", priority=" + priority +
            '}';
  }

  @Override
  public int compareTo(Task task) {

    return priority.compareTo(task.priority);
  }

  public enum Priority {
    HIGH, MEDIUM, LOW;
  }


}
