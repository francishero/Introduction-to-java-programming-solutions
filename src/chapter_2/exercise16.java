package chapter_2;

import java.util.Scanner;

/**
 *
 *  Write a program that prompts the user to enter the
 side of a hexagon and displays its area
 */
public class exercise16 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter the side: ");
        double side = input.nextDouble() ;

        double area = (3 * Math.sqrt(3) / (2)) * (side * side) ;

        System.out.print("The area of the hexagon is "+ area);
    }
}
