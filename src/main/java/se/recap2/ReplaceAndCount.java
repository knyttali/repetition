package se.recap2;

public class ReplaceAndCount {
    public void run() {
        String StringToChange = "Detta är en sträng som du skall ändra";
        int nrStars = 0;

        String newString = StringToChange.replace(' ', '*');
        for (int i = 0; i < newString.length(); i++) {
            if(newString.charAt(i) == '*'){
                nrStars++;
            }
        }
        System.out.println(newString);
        System.out.println("Antal stjärnor: " + nrStars);
    }

}
/**
 * D2 - Replace and count Du har en sträng med texten ”Detta är en sträng som du
 * skall ändra”. Ersätt via kod
 * 
 * alla blanktecken i strängen med tecknet * . Räkna sedan ut via kod hur många
 * 
 * förekomster det finns av tecknet * i strängen.
 */