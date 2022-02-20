package dto.figures;

import dto.figures.Shape;

public class Circle implements Shape {
  private double promien;

  public Circle(double promien) {
    this.promien = promien;
  }

  @Override
  public double calculateArea() {
    return PI * (promien * promien);
  }

  @Override
  public double calculatePerimeter() {
    return 2 * PI * promien;
  }

  @Override
  public void printArea() {
    System.out.println("Pole kola to " + calculateArea());
  }

  @Override
  public void printPerimeter() {
    System.out.println("Obwod kola to " + calculatePerimeter());
  }
}
