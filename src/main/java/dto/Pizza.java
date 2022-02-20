package dto;

public enum Pizza {
  MARGHERITA(true, true, false, false),
  CAPRICIOSA(true, true, true, false),
  PROSCIUTTO(true, true, false, true);


  private final boolean sosPomidorowy;
  private final boolean ser;
  private final boolean pieczarki;
  private final boolean szynka;

  Pizza(boolean sosPomidorowy, boolean ser, boolean pieczarki, boolean szynka) {
    this.sosPomidorowy = sosPomidorowy;
    this.ser = ser;
    this.pieczarki = pieczarki;
    this.szynka = szynka;
  }


  @Override
  public String toString() {
    return "Pizza{" +
            "sosPomidorowy=" + sosPomidorowy +
            ", ser=" + ser +
            ", pieczarki=" + pieczarki +
            ", szynka=" + szynka +
            '}';
  }

  public static void showInfoOfAllPizzas() {
    for (Pizza pizza : Pizza.values()) {
      System.out.println( pizza.name() + " " + pizza.toString());
    }
  }

  public static void getNAmeOfPizza(Pizza pizza) {
    System.out.println(pizza.name());
  }


  public static Pizza checkPizzaTypeTypedByCustomer(String pizzaTypeTypedByCustomer) throws Exception {
    for (Pizza pizza : Pizza.values()) {
      if (pizzaTypeTypedByCustomer.equalsIgnoreCase(pizza.name())) {
        return pizza;
      }
    }
    throw new Exception("Nie ma takiego typu pizzy!");
  }
}
