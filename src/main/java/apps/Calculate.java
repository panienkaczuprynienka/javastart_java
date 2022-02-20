package apps;

import controllers.CalculatorController;

import java.util.Scanner;

public class Calculate {
  public static void main(String[] args) {
    CalculatorController calculatorController = new CalculatorController();
    Scanner scanner = new Scanner(System.in);

    boolean error = true;

    do {
      try {
        System.out.println("Podaj pierwsza liczbe ");
        double firstNumber =  Double.parseDouble(scanner.nextLine());

        System.out.println("Podaj druga liczbe ");
        double secondNumber = Double.parseDouble(scanner.nextLine());

        System.out.println("Podaj operator");
        String operator = scanner.nextLine();
        calculatorController.printResult(operator, firstNumber, secondNumber);
        error = false;
      } catch (UnsupportedOperationException e) {
        System.err.println("Unsupported operator");
      } catch (NumberFormatException e) {
        System.err.println("This is not a number!");
      } catch (NullPointerException e){
        System.err.println("Nie podano poprawnych danych!");
      }
    } while (error);

  }
}
