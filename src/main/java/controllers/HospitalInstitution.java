package controllers;

import dto.hospitalemployees.Doctor;
import dto.hospitalemployees.Nurse;
import dto.hospitalemployees.Person;

import java.util.Arrays;
import java.util.List;

public class HospitalInstitution {
  private List<Person> employees = Arrays.asList(new Doctor("PAt", "hus", 5000.00, 1000.00),
          new Nurse("Ela", "Ewanska", 2000.00, 10),
          new Nurse("Ala", "Olszewska", 3000.00, 55));


  public void add(Person person) {
    employees.add(person);
  }

  public void getInfo() {
    for (Person person : employees) {
      person.getInfo();
    }

  }
}
