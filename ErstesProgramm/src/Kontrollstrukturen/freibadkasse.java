package Kontrollstrukturen;

import java.util.Scanner;

public class freibadkasse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alter;
        double preis;

        System.out.print("Geben sie ihr alter an: y");

        alter = sc.nextInt();
        preis = 0;

        if (alter < 12) {
            if (alter <= 12) {
                if (alter <= 3) {
                    preis = 0;
                }
            } else {
                preis = 2.50;
            }
        } else {
            if (alter >= 65) {
                preis = 2.50;
            } else {
                preis = 5;
            }
        }
        System.out.println("Dein Preis beträgt:" + preis);
    }
}
