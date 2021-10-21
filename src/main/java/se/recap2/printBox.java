package se.recap2;

public class printBox {
    public void run() {
        System.out.println("Program starts: ");

        System.out.print("Enter height: ");
        int height = Integer.parseInt(System.console().readLine());

        System.out.print("Enter width: ");
        int width = Integer.parseInt(System.console().readLine());
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                System.out.print("#");
            }
            System.out.println("");
        }

    }
}
/**
 * C7 - Print a box
 * 
 * Write a program that will print a box of #’s taking from user the height and
 * width values.
 * 
 * Program Starts: Enter height: 7 Enter width: 5
 * 
 * Output: ##### ##### ##### ##### ##### ##### #####
 */