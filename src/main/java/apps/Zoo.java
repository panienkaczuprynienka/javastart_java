package apps;


import dto.animals.Animal;
import dto.animals.Cat;
import dto.animals.Dog;

import java.util.ArrayList;
import java.util.List;

class Zoo {
  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<>();
    animals.add(new Dog("Burek"));
    animals.add(new Cat("Mruczek"));
    animals.add(new Animal("Kotopies"));

    changeAnimalName(animals.get(2), "Piesełek");
    animals.forEach(a -> a.giveSound());

    Animal dog = new Dog("Burek");
    Animal cat = new Cat("Mruczek");

    if (animals.get(1) instanceof Dog) {
      ((Dog) animals.get(1)).bark();
    } else if (animals.get(1) instanceof Cat) {
      ((Cat) animals.get(1)).meow();

    }    // rzutowanie do zmiennej
    Dog specificDog = (Dog) dog;
    specificDog.bark();

    // rzutowanie "w locie"
    ((Cat) cat).meow();
  }

  private static void changeAnimalName(Animal animal, String newName) {
    animal.setName(newName);
  }
}
