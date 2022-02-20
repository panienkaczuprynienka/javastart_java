package dto.hospitalemployees;

public class Person {
  private String name;
  private String lastName;
  private double salary;

  public Person(String name, String lastName, double salary) {
    this.name = name;
    this.lastName = lastName;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void getInfo(){
    System.out.println("Imię to" + name + " Nazwisko to " + lastName + "salary to " + salary);
  }
}
