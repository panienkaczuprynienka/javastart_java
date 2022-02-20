package controllers;

import dto.iterator.Person;

import java.util.*;

public class IteratorPersonController {
  public static void main(String[] args) {


    Map<String, Person> people = new TreeMap<>();
    people.put("Kowalska", new Person("Ilona", "Kowalska", 12));
    people.put("Źdźbło", new Person("Jan", "Źdźbło", 40));
    people.put("Aleksandrzak", new Person("Aleksandra", "Aleksandrzak", 33));
    people.put("Borowiec", new Person("Ilona", "Borowiec", 55));

    Collection<Person> values = people.values();
    Iterator<Person> iterator = values.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

  }}