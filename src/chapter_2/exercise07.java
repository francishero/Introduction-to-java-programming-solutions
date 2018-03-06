package chapter_2;

import java.util.Scanner;

/**
 *
 *  Write a program that prompts the user to enter the
 minutes (e.g., 1 billion), and displays the number of years and days for the min-
 utes. For simplicity, assume a year has 365 days
 */
public class exercise07 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter the number of minutes:  ");

        int minutes = input.nextInt() ;
        // 60 minutes = 1 hour
        // 24 hours = 1 day
        // 365 days =  1 year
        // given minutes i just need to convert them to hours and then days and then years and days % 365 to get remaining days

        int hours = minutes / 60 ;
        int days = hours / 24 ;
        int years = days / 365 ;
        int remainingDays = days % 365 ;

        System.out.print( minutes +" minutes is approximately " + years + " years and " + remainingDays + " days");
    }
}
