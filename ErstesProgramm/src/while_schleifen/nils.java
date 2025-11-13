package while_schleifen;

import java.util.Scanner;

public class nils {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);                     // Ein Scanner wird erzeugt, welcher für Eingaben notwendig ist.
    String eingabe = "o" ;                                       // Erzeuge ein leeres Wort vom Typ String.

    while (!eingabe.equals ("Oleg")) {                       // solange das Lösungswort NICHT erraten wurde. Deswegen steht ein ! am Anfang
      System.out.print("Leider falsch. Neuer Versuch: ");
      eingabe = sc.next();                             // Der Nutzer gibt eine neue Eingabe ein.
    }

    System.out.println("Richtiges Wort erraten.");

  }  // end of class While_lerne
}
