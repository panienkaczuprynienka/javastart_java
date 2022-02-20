package apps;

import controllers.CalculatorController;
import dto.figures.Circle;
import dto.figures.Rectangle;
import dto.figures.Shapes;
import dto.figures.Triangle;

import java.util.Scanner;

public class CalculateShapes {
  public static void main(String[] args) {
    CalculatorController calculatorController = new CalculatorController();
    Scanner scanner = new Scanner(System.in);

    boolean error = true;
    Shapes shapeTyped = Shapes.UNKNOWN;
    do {
      try {
        System.out.println("Podaj co chcesz zmierzyc");
        Shapes.printAllShapes();
        shapeTyped = Shapes.valueOf(scanner.nextLine());
        error = false;
      } catch (IllegalArgumentException e) {
        System.out.println("Niepoprawny rodzaj obiektu");
      }
    }
    while (error);


    do {
      try {
        switch (shapeTyped) {
          case RECTANGLE:
            System.out.println("Podaj pierwszy bok ");
            double firstNumber = Double.parseDouble(scanner.nextLine());

            System.out.println("Podaj drugi bok ");
            double secondNumber = Double.parseDouble(scanner.nextLine());

            Rectangle rectangle = new Rectangle(firstNumber, secondNumber);
            rectangle.printArea();
            rectangle.printPerimeter();
            error = false;
            break;
          case CIRCLE:
            System.out.println("Podaj promien");
            double promien = Double.parseDouble(scanner.nextLine());

            Circle circle = new Circle(promien);
            circle.printArea();
            circle.printPerimeter();
            error = false;
            break;

          case TRIANGLE:
            System.out.println("Podaj pierwszy bok ");
            double a = Double.parseDouble(scanner.nextLine());

            System.out.println("Podaj drugi bok ");
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println("Podaj trzeci bok bok ");
            double c = Double.parseDouble(scanner.nextLine());

            System.out.println("Podaj h ");
            double h = Double.parseDouble(scanner.nextLine());

            Triangle triangle = new Triangle(a, h, b, c);
            triangle.printArea();
            triangle.printPerimeter();
            error = false;
            break;
        }

        error = false;
      } catch (UnsupportedOperationException e) {
        System.err.println("Unsupported operator");
      } catch (NumberFormatException e) {
        System.err.println("This is not a number!");
      } catch (NullPointerException e) {
        System.err.println("Nie podano poprawnych danych!");
      }
    } while (error);

  }
}
