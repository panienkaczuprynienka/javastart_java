package apps;

import dto.pair.Pair;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairApp {
  public static void main(String[] args) {
    Pair<String, Integer> pair = new Pair<>("Ewelina", 12);
    Pair<BigDecimal, BigDecimal> pair2 = new Pair<>(BigDecimal.valueOf(13.98), BigDecimal.valueOf(13.98));
    Pair<Integer, Integer> pair3 = new Pair<>(14, 15);

    List<Pair> pairs = new ArrayList<>();
    pairs.add(pair);
    pairs.add(pair2);
    pairs.add(pair3);

    for (Pair p : pairs) {
      printPair(p);
    }


  }

  static <T, V> void printPair(Pair<V, T> pair) {
    System.out.println("Para to " + pair.getV() + " oraz " + pair.getT());

  }
}
