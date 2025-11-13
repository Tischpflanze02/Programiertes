package while_schleifen;

import java.util.Scanner;

public class zahlraten {
    public static void main(String[] args) {
        int zufallszahl = (int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);

        int rateversuche = 0;
        int ratezahl = 0;

        System.out.println("############");      
        System.out.println("Zahlenraten");
        System.out.print("geben sie eine greade Zahl ein: ");
        do  {
            rateversuche = rateversuche + 1;
            ratezahl = sc.nextInt();
            if (ratezahl != zufallszahl) {
                if (ratezahl > zufallszahl) {
                    System.out.println("Meine Zahl ist Kleiner");
                } else {
                    System.out.println("Meine Zahl ist größer");
                }
            } else {
                break;
            }
        }while (zufallszahl != ratezahl);
        System.out.println("Du hast "+rateversuche+" versuche gebraucht und die Zahl wahr "+zufallszahl+"!");
    }
}
