package apps;

import controllers.Lotto;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoApp {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> integers = new ArrayList<>();
    for (int i = 0; i < 6; i++) {
      System.out.println("Wczytaj liczbe");
      integers.add(scanner.nextInt());
    }
    System.out.println("PRzeliczam wynik");
    Lotto lotto = new Lotto();
    lotto.generate();
    List<Integer> randomize = lotto.randomize();
    System.out.println("Randomowe liczby to " + randomize);
    int result = lotto.checkResult(integers);
    System.out.println("Trafiles " + result + " liczb");
    scanner.close();
  }
}
