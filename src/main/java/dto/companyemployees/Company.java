package dto.companyemployees;

import java.util.List;

public class Company {
  private List<Employee> listOfEmployees;
  public static final int MAX_EMPLOYEES = 3;

  public Company(List<Employee> listOfEmployees) {
    this.listOfEmployees = listOfEmployees;
  }

  public void addEmployee(Employee employee) {
    if (listOfEmployees.size() < 3) {
      listOfEmployees.add(employee);
    }
  }

  public List<Employee> getListOfEmployees() {
    return listOfEmployees;
  }

  public void setListOfEmployees(List<Employee> listOfEmployees) {
    this.listOfEmployees = listOfEmployees;
  }
}
