package apps;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaApp {
  public static void main(String[] args) {
    print();
    System.out.println("po przesianiu ");
    deleteModulo2();

    Collections.sort(getListOfNames(), String::compareToIgnoreCase);

    Stream.iterate(0, x -> x + 1)
            .filter(e -> e > 100)
            .filter(e -> e < 1000)
            .filter(e -> e % 5 == 0)
            .limit(10)
            .map(e->e*3)
            .forEach(System.out::println);

  }


  public static List<String> getListOfNames() {
    return Arrays.asList("Iwona", "Tomasz", "Józek", "Wiesława", "Apolonia");
  }

  public static List<Integer> getListOfRandoms() {
    List<Integer> randoms = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      Random random = new Random();
      int randomInt = random.nextInt();
      randoms.add(randomInt);
    }
    return randoms;
  }

  public static void print() {
    getListOfRandoms().stream().forEach(System.out::println);
  }

  public static void deleteModulo2() {
    List<Integer> collect = getListOfRandoms().stream().filter(n -> !numberIsDivideable(n)).collect(Collectors.toList());
    collect.stream().forEach(System.out::println);
  }

  public static boolean numberIsDivideable(Integer number) {
    return number % 2 == 0;
  }
}
