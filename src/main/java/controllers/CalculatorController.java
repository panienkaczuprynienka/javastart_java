package controllers;

import dto.UnknownOperatorException;

public class CalculatorController {
  private static final String PLUS = "+";
  private static final String MINUS = "-";
  private static final String MULTIPLY = "*";
  private static final String DIVIDE = "/";

  public void printResult(String sign, double firstNumber, double secondNumber){
    System.out.println(calculateNumbers(sign, firstNumber, secondNumber));
  }

  public double calculateNumbers(String sign, double firstNumber, double secondNumber) {
    switch (sign) {
      case PLUS:
      return   addNumbers(firstNumber, secondNumber);
      case MINUS:
        return  minusNumbers(firstNumber, secondNumber);
      case MULTIPLY:
        return  multiplyNumbers(firstNumber, secondNumber);
      case DIVIDE:
        return  divideNumbers(firstNumber, secondNumber);
      default:
        throw new UnsupportedOperationException("Nieobsługiwany operator!");

    }
  }

  private double divideNumbers(double firstNumber, double secondNumber) {
    if (secondNumber != 0) {
      return firstNumber / secondNumber;
    } else {
      throw new ArithmeticException(" Nie można dzielić przez 0 !");
    }
  }

  private double multiplyNumbers(double firstNumber, double secondNumber) {
    return firstNumber * secondNumber;
  }

  private double minusNumbers(double firstNumber, double secondNumber) {
    return firstNumber - secondNumber;
  }

  private double addNumbers(double firstNumber, double secondNumber) {
    return firstNumber + secondNumber;
  }

  public static double calculate(double a, double b, String operator) throws UnknownOperatorException {
    double result = 0;

    switch (operator) {
      case PLUS:
        result = a + b;
        break;
      case MINUS:
        result = a - b;
        break;
      case MULTIPLY:
        result = a * b;
        break;
      case DIVIDE:
        if (b == 0)
          throw new ArithmeticException("Nie możesz dzielić przez 0");
        result = a / b;
        break;
      default:
        throw new UnknownOperatorException("Wykorzystujesz niezdefiniowany opereator arytmetyczny");
    }
    return result;
  }
}
