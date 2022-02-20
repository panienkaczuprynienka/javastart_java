package dto.companyemployees;

import java.io.Serializable;

public class Employee extends Person implements Serializable {
  private double salary;

  public Employee(String name, String lastname, double salary) {
    super(name, lastname);
    this.salary = salary;
  }

  public String getName() {
    return super.getName();
  }

  public String getLastName() {
    return super.getLastname();
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "name= " + super.getName() +
            "lastname= " + super.getLastname() +
            "salary=" + salary +
            '}';
  }
}
