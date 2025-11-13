package while_schleifen;

public class würfelgrantiert {
    public static void main(String[] args) {
        int augen = 0;
        int versuche = 0;


        while (augen != 6) {
            augen = (int) (Math.random() * 6 + 1);
            System.out.println("Du hast eine "+augen+" gewürfwelt!");
            versuche = versuche +1;
        }
        System.out.println("Du hast eine Sechs gewürfelt!");
        System.out.println("Sie haben "+versuche+" versuche gebraucht !" );
    }
}
