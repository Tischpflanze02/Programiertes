package Strukturgramm;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Willkommen beim BMI-Rechner"); // wilkommens nachricht ausgeben
        System.out.println("***************************"); // sternechen auchgeben

        System.out.print("Körpergewicht in kg eingeben: "); // Körpergech in kg eingeben ausgeben
        double koerpergewicht = sc.nextDouble();

        System.out.print("Körpergröße in m eingeben: "); //
        double koepergroesse = sc.nextDouble();

        double bmi = koerpergewicht / (koepergroesse * koepergroesse); // bmi aussrechnen
        System.out.println("Der BMI beträgt: " + bmi);
        sc.close();
    }
}
