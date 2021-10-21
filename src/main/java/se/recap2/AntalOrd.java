package se.recap2;

public class AntalOrd {
    public void run() {
        int antalNamn = 0;

        while (true) {
            String namn = skrivInEttNamn();
            
            if(namn.equals("EXIT")){
                System.out.println("Hej då. Du matade in totalt " + antalNamn + " stycken namn");
                break;
            }
            antalNamn++;
            antalCharNamn(namn);
        }
    }

    public void antalCharNamn(String namn){
        System.out.println("Antal tecken i namnet: " + namn.length());
    }

    public String skrivInEttNamn(){
        System.out.println("Skriv in ett namn:");
        String input = System.console().readLine();
        return input;
    }
}
/**
 * D1 - String input Skriv ett program som (förevigt) matar in "Skriv in ett
 * namn:" till en strängvariabel
 * 
 * Du ska skriva ut hur många tecken det namnet har. Och dessutom hålla reda på
 * hur många namn som totalt matats in
 * 
 * 
 * 
 * Skriver man in "EXIT" så skall programmet avslutas och du skriver ut:
 * 
 * Hej då. Du matade in totalt <antal> stycken ord
 */