package dto.figures;

public enum Shapes {
  TRIANGLE(),
  RECTANGLE(),
  CIRCLE(),
  UNKNOWN();


  public static void printAllShapes() {
    for (Shapes v : Shapes.values()) {
      System.out.println(v.name());
    }

  }
}
