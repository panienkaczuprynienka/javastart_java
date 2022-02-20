package apps;

import controllers.ContactManager;
import controllers.ContactReader;
import dto.contact.Contact;

import java.util.Optional;
import java.util.Scanner;

class ContactApp {
  public static void main(String[] args) {
    Optional<ContactManager> contactManager = ContactReader.readFile("contacts1.csv");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj adres email do wyszukania kontaktu:");
    String email = scanner.nextLine();
    if (contactManager.isPresent()) {
      Optional<Contact> contactByEmail = contactManager.get().findByEmail(email);
      if (contactByEmail.isPresent()) {
        System.out.println("Kontakt o wskazanym adresie email:");
        System.out.println(contactByEmail.get().getShortInfo());
      } else {
        System.out.println("Brak kontaktu o wskazanym adresie email");
      }
    }


  }
}
