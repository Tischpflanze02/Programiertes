package while_schleifen;

public class zahl{
    public static void main(String[] args) {
        int zahl = 0,summe = 0;
        while(summe <= 100){
            zahl = zahl +1;
            summe = summe + zahl;
        }
        System.out.println(zahl);
    }
}