package Strukturgramm;

import java.util.Scanner;

public class Temperaturrechner {
    public static void main(String[] args) {
        System.out.print("Wert der Fahrenheit-Skala eingeben: ");
        Scanner s = new Scanner(System.in);
        int fahrenheit = s.nextInt();
        int celsius = (fahrenheit -32) * 5/9;
        System.out.println(fahrenheit+" Grad Fahrenheit sind " + celsius + " Grad Celsius.");

    }
}
