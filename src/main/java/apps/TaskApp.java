package apps;

import controllers.TaskManager;

public class TaskApp {
  public static void main(String[] args) {
    TaskManager taskManager = new TaskManager();
    taskManager.mainLoop();
  }
}
