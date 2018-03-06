package chapter_2;

import java.util.Scanner;

/**
 *
 *  Suppose you save $100 each month
 into a savings account with the annual interest rate 5%. Thus, the monthly inter-
 est rate is 0.05/12 = 0.00417. After the first month, the value in the account
 becomes
 100 * (1 + 0.00417) = 100.417
 After the second month, the value in the account becomes
 (100 + 100.417) * (1 + 0.00417) = 201.252
 After the third month, the value in the account becomes
 (100 + 201.252) * (1 + 0.00417) = 302.507
 and so on.
 Write a program that prompts the user to enter a monthly saving amount and
 displays the account value after the sixth month
 */
public class exercise13 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter the monthly saving amount: ");

        double savingAmount = input.nextDouble() ;

        double firstMonth = savingAmount * (1 + 0.00417) ;
        double secondMonth = (savingAmount + firstMonth) * (1 + 0.00417) ;
        double thirdMonth = (savingAmount + secondMonth) * (1 + 0.00417) ;
        double fourthMonth = (savingAmount + thirdMonth) * (1 + 0.00417) ;
        double fifthMonth = (savingAmount + fourthMonth) * (1 + 0.00417) ;
        double sixthMonth = (savingAmount + fifthMonth) * (1 + 0.00417) ;

        System.out.print("After the sixth month, the account value is $" + sixthMonth);
    }
}
