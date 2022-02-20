package dto.figures;

public class Rectangle implements Shape{
  private double a;
  private double b;

  public Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
  }

  @Override
  public double calculateArea() {
    return a * b;
  }

  @Override
  public double calculatePerimeter() {
    return 2 * a + 2 * b;
  }

  @Override
  public void printArea() {
    System.out.println("Pole prostokąta to " + calculateArea());
  }

  @Override
  public void printPerimeter() {
    System.out.println("Obwod prostokąta to " + calculatePerimeter());
  }
}
