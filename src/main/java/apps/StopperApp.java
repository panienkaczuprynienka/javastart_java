package apps;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.util.Scanner;

public class StopperApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Aby rozpoczac pomiar wcisnij enter");
    Instant instant1 = null;
    String nextLine = scanner.nextLine();

     instant1 = Instant.now();


    Instant instant2 = null;
    System.out.println("Aby zakonczyc pomiar wcisnij enter");
    String nextLine2 = scanner.nextLine();

      instant2 = Instant.now();



    Duration duration =  Duration.between(instant1, instant2);
    System.out.println("Zmierzony czas w sekundach to " + duration.getSeconds());
  }
}
