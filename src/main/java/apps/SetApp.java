package apps;

import java.io.*;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class SetApp {
  public static void main(String[] args) {
    String fileName = "namespl.txt";

    TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
      }
    });

    String name;

    try {
      Scanner scanner = new Scanner(new File(fileName));
    while (scanner.hasNextLine()){
      name = scanner.nextLine();
      names.add(name);
    }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }


    System.out.println("Ilość imion to" + names.size());
    System.out.println("Pierwsze imie to" + names.first());
    System.out.println("Ostatnie imie to" + names.last());
  }


}