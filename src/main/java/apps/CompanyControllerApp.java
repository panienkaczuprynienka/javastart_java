package apps;

import controllers.CompanyController;
import dto.companyemployees.Employee;

import java.util.Scanner;

public class CompanyControllerApp {
  public static void main(String[] args) {
    CompanyController companyController = new CompanyController();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Co chchesz zrobic 1 - dodaj nowego pracownika, 2 wyszukaj informacje o pracowniku, 3 wyjdź");
    String cochcheZrobic = scanner.nextLine();

    switch (cochcheZrobic) {
      case  "1" :
        System.out.println("Podaj imie");
        String imie = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String nazwisko = scanner.nextLine();
        String key = imie + " " + nazwisko;
        System.out.println("Podaj salary");
        double salary = Double.parseDouble(scanner.nextLine());
        companyController.addEmployee(new Employee(imie, nazwisko, salary));
        System.out.println("Dodani już pracownicy to ");
        companyController.printAllEmployees();
              break;
      case  "2" :
        System.out.println("Podaj imie");
        String imie2 = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String nazwisko2 = scanner.nextLine();
        companyController.getEmployee(imie2, nazwisko2);
        System.out.println(companyController.getEmployee(imie2, nazwisko2));
              break;
      case "3" :
        scanner.close();
              break;

    }
    }
}
