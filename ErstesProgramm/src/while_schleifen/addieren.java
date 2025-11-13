package while_schleifen;

import java.util.Scanner;

public class addieren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte Zahlen eingeben, die addiert werden sollen: ");

        double eingabe = -1;
        double summe = 0;

        while (eingabe != 0) {
            eingabe = sc.nextDouble();
            summe = eingabe + summe;
            if (eingabe != 0) {
                System.out.print("+ ");
            }
        }
        System.out.println("--------------");
        System.out.println("Summe ist " + summe);

    }
}
