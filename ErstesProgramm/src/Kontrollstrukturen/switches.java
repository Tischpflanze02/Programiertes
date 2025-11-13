package Kontrollstrukturen;

import java.util.Scanner;

public class switches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opeartor;
        double zahl1, zahl2,ergebnis ;
        ergebnis = 0;


        System.out.println("Zahl1 eingeben");
        zahl1 = sc.nextDouble();
        
        System.out.println("Zahl2 eingeben");
        zahl2 = sc.nextDouble();

        System.out.println("Rechenoperator eingeben");
        opeartor = sc.next();

        switch (opeartor) {
            case "*" -> ergebnis = zahl1 * zahl2;
            case "-" -> ergebnis = zahl1 - zahl2;
            case "+" -> ergebnis = zahl1 + zahl2;
            case "/" -> ergebnis = zahl1 / zahl2;
            default -> System.out.println("ungültig");
        }
        System.out.println("Die Zahl"+zahl1+ opeartor + zahl2 +"ergibt"+ergebnis);

    }
}
