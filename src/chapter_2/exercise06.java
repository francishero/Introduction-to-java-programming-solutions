package chapter_2;

import java.util.Scanner;

/**
 *
 *  Write a program that reads an integer between 0 and
 1000 and adds all the digits in the integer. For example, if an integer is 932 , the
 sum of all its digits is 14
 */
public class exercise06 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter a number between 0 and 1000: ");

        int number = input.nextInt() ;

        double sum = 0.0 ;
        int i ;

        // works for all numbers
        while (number != 0) {
            i = number % 10 ;
            sum += i ;
            number = number / 10 ;
        }

        System.out.print("The sum of the digits is " + sum);
    }
}
