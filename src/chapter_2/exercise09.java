package chapter_2;

import java.util.Scanner;

/**
 *
 *  Write a program that prompts the user to enter the starting velocity v 0 in meters/
 second, the ending velocity v 1 in meters/second, and the time span t in seconds,
 and displays the average acceleration
 */
public class exercise09 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("Enter v0, v1, and t: ");

        double startingVelocity = input.nextDouble() ;
        double endingVelocity = input.nextDouble() ;
        double timeSpan = input.nextDouble() ;

        double acceleration = (endingVelocity - startingVelocity) / timeSpan ;

        System.out.println("The average acceleration is "+ acceleration);
    }
}
