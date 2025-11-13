package while_schleifen;

public class Maexchen {
    public static void main(String[] args) {
        int wuerfel1 = 0,  wuerfel2 = 0, maexchen = 0, anzahlwürfe = 0; 
        double punkte = 0; 
        boolean nichtkombinierbar = false;
        while (punkte <= 100000) {
            wuerfel1 = (int) (Math.random()* 6 + 1);
            wuerfel2 = (int) (Math.random()* 6 + 1);
            anzahlwürfe = anzahlwürfe +1;


            if (wuerfel1 == 1  && wuerfel2 == 2 || wuerfel2 == 2 && wuerfel1 == 1){
                maexchen = maexchen + 1;
                punkte = punkte + 1000;
                nichtkombinierbar = true;
            }
            if (wuerfel1 == wuerfel2) {
                punkte = punkte + wuerfel1 * 100;
                nichtkombinierbar = true;
            }
            if (nichtkombinierbar == false) {
                if (wuerfel1 > wuerfel2) {
                    punkte= punkte + (wuerfel1+wuerfel2);
                }else{
                    punkte = punkte + (wuerfel1+wuerfel2);
                }
            }
        }
        double maexchenprozent =(maexchen/(1.0*anzahlwürfe))*100;
        System.out.println("++++++ Mäxchen +++++++");
        System.out.println("Punkte Endstand: "+ punkte);
        System.out.println("Anzahl Würfe: "+ anzahlwürfe);
        System.out.println("Anzahl maexchen: "+ maexchen);
        System.out.println("Maexchen in Prozent: "+ maexchenprozent);
    }
}
