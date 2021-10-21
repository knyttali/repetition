package se.recap2;

public class Kod {
    public void run() {
        final int code = 1234;
        int i = 3;
        while ( i > 0) {
            System.out.println("(" + i + " försök kvar) Please enter pin: ");
            int input = Integer.parseInt(System.console().readLine());
            i--;
            if(input == code){
                System.out.println( "Correct, welcome back.");
                break;
            } else{
                System.out.println("Incorrect, try again.");
            }
        }
        if(i==0){
            System.out.println("Sorry but you have been locked out.");
        }

    }
}
/**
 * C8 - Secret code
 * 
 * You have to design the code such that the user has only three tries to guess
 * the correct pin of the account. You set the pin as a constant with a final
 * attribute. When correct display “Correct, welcome back.” When incorrect
 * display “Incorrect, try again.”. When ran out of tries display “Sorry but you
 * have been locked out.”
 * 
 * Program Starts: Please enter pin: 22132 Output: Incorrect, try again. Please
 * enter pin: 23412 Output: Incorrect, try again. Please enter pin: 12345
 * Output: Correct, welcome back.
 * 
 * Program Starts: Please enter pin: 22132 Output: Incorrect, try again. Please
 * enter pin: 23412 Output: Incorrect, try again. Please enter pin: 00000
 * Output: Sorry but you have been locked out.
 */