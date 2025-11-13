package Strukturgramm;

import java.util.Scanner;

public class Treibstoffverbrauch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //scanner erstellen

        System.out.print("Bitte geben sie die Anzahl der LKW/s eingeben: ");
        double anzahllkw = sc.nextDouble(); // variable anzahl lkws erstellen

        System.out.print("Biite geben sie die anzahl der tage eingeben: ");
        double tage = sc.nextDouble();

        double spritverbrauch = (35.0/100.0) * 450.0; // 35km / 450km * 100 = spritverbrauch 
        
        double ergebnis = spritverbrauch * anzahllkw * tage;
        System.out.println("\nDer Insgesammt sprittverbrauch ist " + ergebnis + " Litter"); // ausgabe vom gesamt 
        //System.out.println(spritverbrauch); // test 
    }
}