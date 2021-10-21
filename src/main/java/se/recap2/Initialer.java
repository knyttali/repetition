package se.recap2;

public class Initialer {
    public void run() {
        System.out.print("Program starts: Please enter name: ");
        String name = System.console().readLine();
        String[] listaFirstLastNames = name.split(" ");
        String firstName = listaFirstLastNames[0];
        String lastName = listaFirstLastNames[1];

        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);

       System.out.println("Output: " + Character.toUpperCase(firstInitial) + "." + Character.toUpperCase(lastInitial) );
    }
}
/**
 * D6 - Initialer
 * 
 * Write a function to convert a name into initials. You can assume the program
 * takes in two words with one space in between them. The output should be two
 * capital letters with a dot separating them.
 * 
 * It should look like this:
 * 
 * Program Starts: Please enter name: Sam Smith
 * 
 * Output: S.S
 */