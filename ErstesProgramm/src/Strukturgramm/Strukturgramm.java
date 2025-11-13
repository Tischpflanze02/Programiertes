package Strukturgramm;

import java.util.Scanner;

public class Strukturgramm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int umfang = 2*a*2*b;
        int fläche = a*b;
        System.out.println("umfang: "+ umfang);
        System.out.println("fläche: "+ fläche);

    }
}
