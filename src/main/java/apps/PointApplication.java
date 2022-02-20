package apps;

import controllers.PointController;
import dto.Point;

import java.util.Locale;
import java.util.Scanner;

public class PointApplication {
  public static void main(String[] args) {
    Point pointA = new Point(10, -10);
    PointController pointController = new PointController();
    pointController.changeX(pointA, -7);
    System.out.println("Punkt A ma x rowny " + pointA.getX());

    int[] tablica = {5, 10, 15};
    int sum = 0;
    for (int i = 0; i < tablica.length; i++) {
      sum = sum + tablica[i];

    }
    System.out.println("Suma to " + sum);

    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    System.out.println("Wpisz ile chchesz wprowadzic liczb");
    int ileLiczb = scanner.nextInt();
    int summary=0;
    for (int i = 0; i < ileLiczb; i++) {
      System.out.println("Podaj kolejna liczbę");
      int number = scanner.nextInt();
      summary = summary+number;
    }
    System.out.println("Suma podanych przez ciebie liczb to " + summary);



    scanner.close();


  }

}
