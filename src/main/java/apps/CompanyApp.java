package apps;

import dto.companyemployees.Employee;

import java.io.*;
import java.util.Scanner;

public class CompanyApp {
  public static void main(String[] args) {

    String fileName = "employee2.txt";
    Scanner scanner = new Scanner(System.in);

    String name = new String();
    String lastName = new String();
    double salary = 0;

    boolean error = true;

    do {
      try {
        System.out.println("Podaj imię pracownika");
        name = scanner.nextLine();

        System.out.println("Podaj nazwisko pracownika");
        lastName = scanner.nextLine();


        System.out.println("Podaj wypłatę pracownika");
        salary = Double.parseDouble(scanner.nextLine());

        error = false;

      } catch (NumberFormatException e) {
        System.err.println("This is not a correct format!");
      } catch (NullPointerException e) {
        System.err.println("Emply value for field");
      }
    } while (error);


    Employee employee = new Employee(name, lastName, salary);

    try (
            var fileOutputStream = new FileOutputStream(fileName);
            var objectOutputStream = new ObjectOutputStream(fileOutputStream);
    ) {
      objectOutputStream.writeObject(employee);
      System.out.println("Zapisano obiekt " + employee + " do pliku " + fileName);
    } catch (IOException e) {
      e.printStackTrace();
    }


    Employee employeeRed = null;

    try (
            var fileInputStream = new FileInputStream(fileName);
            var objectInputStream = new ObjectInputStream(fileInputStream);
    ) {

      employeeRed = (Employee) objectInputStream.readObject();
      if (employeeRed != null) {
        System.out.println("Wczytano dane o " + employeeRed);

      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
