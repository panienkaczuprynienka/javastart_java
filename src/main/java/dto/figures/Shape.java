package dto.figures;

public interface Shape {
  public static final double PI = Math.PI;

  double calculateArea();

  double calculatePerimeter();

  void printArea();

  void printPerimeter();
}
