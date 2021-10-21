package se.recap2;

public class TaFramTecken {
    public void run() {
        System.out.println("mata in ett ord eller en text: ");
            String string = System.console().readLine();
        while (true) {
            System.out.println("ange en position (mata in ett tal): ");
            int position = Integer.parseInt(System.console().readLine());
            if(position >= 0 && position < string.length()){
                System.out.println(string.charAt(position));
                break;
            }
            System.out.println("talet måste vara lägre än textens längd och får ej vara mindre än 0");
        }
    }
}
/**
 * D5 - Plocka fram ett tecken Be användare mata in ett ord eller en mening.
 * 
 * Fråga användaren: ange en position: och mata in ett tal
 * 
 * Ta fram det tecken som finns i strängen på den positionen
 * 
 * OBS: Felkontroller...<0 eller > length ska ge felmeddelande och ny inmatning
 */