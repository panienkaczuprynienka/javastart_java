package apps;

import dto.carparts.ExhaustPart;
import dto.carparts.Tyre;

public class WholesalerApp {
  public static void main(String[] args) {
    Tyre tyre = new Tyre("p123", "michalin", "model1", "biznes", 123, 300);
    ExhaustPart exhaustPart = new ExhaustPart("p123", "michalin", "model1", "biznes",true);

    System.out.println("Moja opona to " + tyre);
    System.out.println("Moj uklad wydechowy to " + exhaustPart);
  }
}
