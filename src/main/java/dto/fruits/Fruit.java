package dto.fruits;

public class Fruit {
  private double weight;
  private String type;

  public Fruit(double weight, String type) {
    this.weight = weight;
    this.type = type;
  }


  public String getInfo() {
    return "Fruit{" +
            "weight=" + weight +
            ", type='" + type + '\'' +
            '}';
  }
}
