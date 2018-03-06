package chapter_2;

import java.util.Scanner;

/**
 *
 *   Write a program that converts pounds into kilo-
 grams. The program prompts the user to enter a number in pounds, converts it
 to kilograms, and displays the result. One pound is 0.454 kilograms
 */
public class exercise04 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter a number in pounds: ") ;

        double pounds = input.nextDouble() ;

        double kilograms = pounds * 0.454 ;

        System.out.print( pounds + " pounds is " + kilograms + " kilograms");
    }
}
