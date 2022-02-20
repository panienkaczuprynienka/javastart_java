package dto.figures;

public class Triangle implements Shape{
  private double a;
  private double h;
  private double b;
  private double c;

  public Triangle(double a, double h) {
    this.a = a;
    this.h = h;
  }

  public Triangle(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public Triangle(double a, double h, double b, double c) {
    this.a = a;
    this.h = h;
    this.b = b;
    this.c = c;
  }

  @Override
  public double calculateArea() {
    return a*(h*h);
  }

  @Override
  public double calculatePerimeter() {
    return a+b+c;
  }

  @Override
  public void printArea() {
    System.out.println("Pole trojkata to " + calculateArea());
  }

  @Override
  public void printPerimeter() {
    System.out.println("Obwod trojkata to " + calculatePerimeter());
  }
}
