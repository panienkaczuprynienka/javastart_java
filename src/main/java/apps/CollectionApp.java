package apps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CollectionApp {
  public static void main(String[] args) throws IOException {

    File fileName = new File("loremipsum.txt");
    var reader = new BufferedReader(new FileReader(fileName));
    List<String> words = new ArrayList<>();
    String tmp = null;

    while ((tmp = reader.readLine()) != null) {
      words.addAll(Arrays.asList(tmp.split(" ")));
    }
    System.out.println(words);


    List<String> words2 = reader.lines()
            .map(line -> line.split(" "))
            .flatMap(Arrays::stream)
            .map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
            .collect(Collectors.toList());

    List<String> collect = words.stream()
            .map(e -> e.replace(".", ""))
            .map(e -> e.replace(",", ""))
            .map(e -> e.trim())
            .collect(Collectors.toList());

    System.out.println(collect);
    long s = collect.stream()
            .filter(CollectionApp::startsWithS)
            .peek(e -> System.out.print(e + " "))
            .count();

    System.out.println("tyle slow zaczyna sie na s " + s);

    long count = collect.stream()
            .filter(CollectionApp::hasLenghtOf5)
            .count();

    System.out.println("tyle slow ma 5 znakow " + count);
  }

  private static boolean startsWithS(String element){
    return  element.startsWith("s");
  }

  private static boolean hasLenghtOf5(String word){
   return word.length() == 5;
  }
}
