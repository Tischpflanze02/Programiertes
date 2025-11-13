package Strukturgramm;

import java.util.Scanner;

public class Kreisberechnung {

    public static void main(String[] args) {
        System.out.print("Radius in cm eingeben: "); //in die erste zeile "Radius in cm eingeben" ausgeben
        Scanner sc = new Scanner(System.in);  //scanner erstellen
        final double PI = Math.PI; //konstante variable pi
        double radius = sc.nextDouble();  //variable erstellen um den durchmesser einlesen
        double durchmesser = 2 * radius; //durchmesser ausrechnen 
        double kreisflaeche = PI * radius * radius; // Kreisflaeche ausrechnen
        double kreisumfang = 2 * PI * radius;  // Kreisumfang ausrechnen 
        System.out.println("Durchmesser: " + durchmesser + "cm" // Durchmesser ausgeben
                + "\nKreisfläche: " + kreisflaeche + "cm" // Kreisfläche ausgeben
                + "\nKreisumfanag: " + kreisumfang + "cm");  //Kreisumfang ausgeben
        //pi = 2;
        sc.close(); // closing the scanner 
    }
}
