package while_schleifen;

import java.util.Scanner;

public class Stern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anzahl = 4,spalte = 2;
        //anzahl = sc.nextInt();
        String x = "*";
        
        while (anzahl >= 1) { 
            while (spalte >= 1) { 
                System.out.print(x);
                spalte--;
            }
            System.out.print(x);
            anzahl--;

            
        
        }
    }
}
