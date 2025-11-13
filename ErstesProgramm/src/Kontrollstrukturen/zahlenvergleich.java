package Kontrollstrukturen;

import java.util.Scanner;

public class zahlenvergleich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zahl1, zahl2;
        
        System.out.println("Vergleich: ");
        System.out.print("erste zahl: ");
        zahl1 = sc.nextInt();

        System.out.println("zweite zahl: ");
        zahl2 = sc.nextInt();




        if (zahl1 < zahl2)   {
            System.out.print("Die größere zahl ist: "+ zahl2);
        } else {
            System.out.print("Die größer zahl ist:"+ zahl1);
        }
    }
}
