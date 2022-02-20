package apps;

import dto.Pizza;

import java.util.Scanner;

public class Pizzeria {
  public static void main(String[] args) throws Exception {

    //Pizza.getNAmeOfPizza(Pizza.MARGHERITA);
    Pizza.checkPizzaTypeTypedByCustomer("margherita");

    Scanner scanner = new Scanner(System.in);
    System.out.println(" Dzien dobry jaką chcialby pan zamówić pizze? Oto możliwości");
    Pizza.showInfoOfAllPizzas();
    System.out.println("Wpisz nazwe pizzy");
    String pizzaName = scanner.nextLine();
    Pizza pizza = Pizza.checkPizzaTypeTypedByCustomer(pizzaName);
    //
    // Pizza pizza = Pizza.valueOf(pizzaName);
    System.out.println("Wybrana przez ciebie pizza to " + pizza.name() + " " + pizza.toString());
  }
}
