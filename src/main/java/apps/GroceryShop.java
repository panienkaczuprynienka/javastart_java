package apps;

import dto.fruits.Apple;
import dto.fruits.Fruit;

public class GroceryShop {
  public static void main(String[] args) {
    Apple apple = new Apple(123,"Czempion" );
    String info = apple.getInfo();
    System.out.println(info);

    Fruit fruit = new Apple(23, "ligol");
    fruit.getInfo();
  }
}
