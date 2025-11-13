package Kontrollstrukturen;

import java.util.Scanner;
import Kontrollstrukturen.Calc;

public class switchescopy {



    public static double add(double value1, double value2) {
        return value1 + value2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opeartor;
        double zahl1, zahl2, ergebnis;
        ergebnis = 0;

        System.out.println("Zahl1 eingeben");
        zahl1 = sc.nextDouble();

        System.out.println("Zahl2 eingeben");
        zahl2 = sc.nextDouble();

        System.out.println("Rechenoperator eingeben");
        opeartor = sc.next();

        ergebnis = Calc.calc(opeartor, zahl1, zahl2);

        System.out.println("Die Zahl" + zahl1 + opeartor + zahl2 + "ergibt" + ergebnis);
        sc.close();

    }
}
