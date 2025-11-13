package Strukturgramm;

import java.util.Scanner; // scanner impotieren 

public class Huehnerhof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner erstellen
        
        System.out.print("Anzahl der Hüner eingeben: "); // Print Anzahl der Hüner eingeben
        double anzahlhuener = sc.nextDouble();           // Variable anzahlhuener erstellen   

        System.out.print("Anzahl der Tage eingeben: "); // Print Anzahl der Tage eingeben
        double anzahltage   = sc.nextDouble();        // variable anzahltage erstellen 
        
        double eierprowoche = (5.6 * anzahlhuener) / 7 * 10;  //ausrechenen von der eierproduktion in den angebenen tagen
        double futerzehntage= 130 * anzahlhuener / 100; //ausrechnen vom Futterverbrauch in zehn tagen. /100 da ... *10 /1000 = /100 

        System.out.println(anzahlhuener+" Hüner legen in "+ anzahltage + " Tagen "+ eierprowoche + " Eier."); // die ausgabe vom überen ausgerechneten ergebniss
        System.out.println("Die "+ anzahlhuener + " Hühner brauchen während dieser Zeit "+ futerzehntage + "kg Futter."); // die ausgabe vom überen ausgerechneten ergebniss
    }
}
