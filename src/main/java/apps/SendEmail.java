package apps;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {
  public static void main(String[] args) throws EmailException {
    Email email = new SimpleEmail();
    email.setHostName("poczta.interia.pl");
    email.setSmtpPort(465);
    email.setAuthenticator(new DefaultAuthenticator("TWOJA_NAZWA", "TWOJE_HASLO"));
    email.setSSLOnConnect(true);
    email.setFrom("TWOJA_NAZWA@interia.pl");
    email.setSubject("Siemaa");
    email.setMsg("Witam, robię super kurs programowania!");
    email.addTo("panienkaczuprynienka@gmail.com");
    System.out.println("Rozpoczęto wysyłanie wiadomości email");
    email.send();
    System.out.println("Wiadomość wysłana");
  }
}
