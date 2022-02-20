package dto.fruits;

public class Apple extends Fruit {

  public static final String TYPE = "jabłkowate";

  private String variety;


  public Apple(double weight, String variety) {
    super(weight, TYPE);
    this.variety = variety;
  }

  @Override
  public String getInfo() {
    return super.getInfo() + variety;
  }
}
