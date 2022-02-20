package controllers;

import dto.todolist.Task;

import java.util.*;

public class TaskManager {

  Queue<Task> tasksList = new PriorityQueue<>();
  private Scanner scanner = new Scanner(System.in);

  public void mainLoop() {
    Option option;

    do {
      printOptions();
      System.out.println("wybierz opcje");
      int optionChosen = scanner.nextInt();
      option = Option.createFromInt(optionChosen);
      scanner.nextLine();

      switch (option) {
        case ADD:
          tasksList.offer(readAndCreateTask());
          System.out.println("Zadanie dodane do kolejki");
          break;
        case TAKE:
          takeTask();
          break;
        case EXIT:
          System.out.println("Papa");
      }
    } while (option != Option.EXIT);
  }


  private void takeTask() {
    if (tasksList.isEmpty()) {
      System.out.println("Kolejka jest pusta");
    } else {
      Task polledTask = tasksList.poll();
      System.out.println("Zadanie do wykonania " + polledTask);
    }
  }

  private Task readAndCreateTask() {
    System.out.println("Podaj nazwę zadania:");
    String name = scanner.nextLine();
    System.out.println("Podaj opis zadania:");
    String description = scanner.nextLine();
    System.out.print("Podaj priorytet :  ");
    for (Task.Priority priority : Task.Priority.values()) {
      System.out.println(priority + " ");
    }
    String priority = scanner.nextLine();
    Task.Priority priorityValue = Task.Priority.valueOf(priority);
    return new Task(name, description, priorityValue);
  }

  private enum Option {
    ADD(0, "Dodaj zadanie"),
    TAKE(1, "Zrób kolejne zadanie"),
    EXIT(2, "Wyjdź");

    int option;
    String description;

    Option(int option, String description) {
      this.option = option;
      this.description = description;
    }

    static Option createFromInt(int option) {
      return values()[option];
    }

    @Override
    public String toString() {
      return "Option{" +
              "option=" + option +
              ", description='" + description + '\'' +
              '}';
    }
  }

  private void printOptions() {
    List<Option> options = List.of(Option.values());
    options.forEach(System.out::println);
  }

}
