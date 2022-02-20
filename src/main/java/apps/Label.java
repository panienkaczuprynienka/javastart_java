package apps;

import java.util.Scanner;

public class Label {
  public static void main(String[] args) {
    System.out.println("ile chchesz wprowadzic wyrazow ?");
    Scanner scanner = new Scanner(System.in);
    int ileWyrazów = scanner.nextInt();
    scanner.nextLine();
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < ileWyrazów; i++) {
      System.out.println("Wprowadz wyraz");
      String wyraz = scanner.nextLine();
      String lastTypo = wyraz.substring(wyraz.length() - 1);
      builder.append(lastTypo);
    }
    System.out.println("Wyraz utworzony z ostatnich liter twoich słów to " + builder.toString());
  }
}
