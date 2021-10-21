package se.recap2;

public class Ordraknaren {
    public void run(){
        System.out.println("Skriv en text: ");
        String textInmatad = System.console().readLine();
        String[] textInmatadArray = textInmatad.split(" ");
        int antalOrd = textInmatadArray.length;
        System.out.println("Antal ord: " + antalOrd);
    }
}
/**D4 - Ordräknaren
Gör ett program där användaren får mata in en mening t ex ”Detta är min text

som jag matar in”. Programmet skall räkna ut hur många ord meningen består av

och meddela användaren om detta.



OBS: detta är svårt. Vi kör happy case = vi kan förutsätta ett endaste MELLANSLAG mrllan */