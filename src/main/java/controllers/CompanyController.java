package controllers;

import dto.companyemployees.Employee;

import java.util.HashMap;
import java.util.Map;

public class CompanyController {
  private HashMap<String, Employee> mapOfEmployees = new HashMap<>();

  public boolean addEmployee(Employee employee) {
    String key = employee.getName() + " " + employee.getLastname();
    if (mapOfEmployees.containsKey(key)) {
      return false;
    } else {
      mapOfEmployees.put(key, employee);
      return true;
    }
  }

  public Employee getEmployee(String name, String lastname) {
    String key = name + " " + lastname;
    return mapOfEmployees.get(key);
  }

  public void printAllEmployees() {
    for (Map.Entry<String, Employee> entry : mapOfEmployees.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());

    }
  }

}
