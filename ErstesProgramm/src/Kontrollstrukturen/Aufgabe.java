package Kontrollstrukturen;

import java.util.Scanner;

public class Aufgabe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Willkommen beim BMI-Rechner"); // wilkommens nachricht ausgeben 
        System.out.println("***************************"); // sternechen auchgeben 

        System.out.print("Körpergewicht in kg eingeben: "); // Körpergech in kg eingeben ausgeben
        double koerpergewicht = sc.nextDouble();

        System.out.print("Körpergröße in m eingeben: "); //
        double koepergroesse = sc.nextDouble();

        double bmi = koerpergewicht / (koepergroesse * koepergroesse); //bmi aussrechnen
        System.out.println("Der BMI beträgt: " + bmi);

        System.out.print("Geben sie ihr alter ein");
        int alter = sc.nextInt();

        if (alter<25) {
            if (bmi<19) {
                System.out.println("Du bist untergewichtig");
            } else {
            }if (bmi>27) {
                System.out.println("Du bist übergewichtig");
            } else {
                System.out.println("Du bist im idealgewicht");
            }
        } else {
            //if (true) {
            //    
            //} else {
            //    // 
            //}
        }

    }
}
