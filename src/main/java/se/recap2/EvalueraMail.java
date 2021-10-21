package se.recap2;

public class EvalueraMail {
    public void run() {
        System.out.print("Mata in en mailadress: ");
        String mail = System.console().readLine();

        if (checkIfSnabelA(mail) == true && checkIfDot(mail)==true) {
            System.out.println("Rimlig adress");
        } else {
            System.out.println("Felaktig adress");
        }
    }

    private boolean checkIfSnabelA(String mail) {
        String[] arrayMail = mail.split("@");
        int lastIndex = -1 + arrayMail.length;
        if (lastIndex == 1) {
            return true;
        }
        return false;
    }

    public boolean checkIfDot(String mail){
        String[] arrayMail = mail.split("\\.");
        int lastIndex = -1 + arrayMail.length;
        if (arrayMail[lastIndex].length() > 3 || arrayMail[lastIndex].length() < 2) {
            return false;
        }
        if (arrayMail.length < 1) {return false;}
        return true;
    }
}
/**
 * D3 - Email validering Be användaren mata in en mailadress. Programmet skall
 * kontrollera att inmatningen är
 * 
 * rätt dvs att det finns ett @ tecken och att det finns en . med 2 eller 3
 * tecken efter.
 * 
 * Meddela användaren om det är rätt eller felaktig adress
 * 
 */