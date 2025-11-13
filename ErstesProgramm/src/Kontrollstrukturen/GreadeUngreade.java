package Kontrollstrukturen;

import java.util.Scanner;

public class GreadeUngreade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geben sie eine zahl ein");
        int zahl = sc.nextInt(); 

        if (zahl % 2 == 0) {
            System.out.println("Die zahl ist greade");
        } else {
            System.out.println("Die zahl ist ungreade");
        }
    }
}
