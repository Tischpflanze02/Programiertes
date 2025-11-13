import java.util.Scanner;

public class Spritrechenr {
    public static void main(String[] args)
    {
     Scanner sverbrauch = new Scanner(System.in);
       
        System.out.println("Wie viele Kilommeter sind sie gefahren ");
        float kilomteranzahl = sverbrauch.nextFloat() ; 
        
        System.out.println("Wie viel liter haben sie verbraucht")  ;
        float kraftstoffverbrauch = sverbrauch.nextFloat() ;
        
        float spritverbrauch = (kraftstoffverbrauch/kilomteranzahl)*100 ;
        System.out.println("dein spritverbrauch pro 100 Kilometer beträgt "+spritverbrauch);

    }    
        
        


}
