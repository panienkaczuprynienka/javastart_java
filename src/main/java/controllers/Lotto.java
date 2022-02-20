package controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lotto {

  private List<Integer> numbersList;

  public List<Integer> generate() {
    numbersList = new ArrayList<>();
    for (int i = 1; i <= 49; i++) {
      numbersList.add(i);
    }
    return numbersList;
  }

  public List<Integer> randomize() {
    Collections.shuffle(numbersList);
    return numbersList;
  }

  public int checkResult(List<Integer> numbersGiven) {
    List<Integer> firstSixNumbers = numbersList.subList(0, 6);
    int howManyShot = 0;
    for (int i = 0; i < firstSixNumbers.size(); i++) {
      int frequency = Collections.frequency(numbersGiven, firstSixNumbers.get(i));
      howManyShot = howManyShot + frequency;
    }
    return howManyShot;
  }
}
