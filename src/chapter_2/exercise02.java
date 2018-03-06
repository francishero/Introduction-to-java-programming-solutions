package chapter_2;

import java.util.Scanner;

/**
 *
 * Write a program that reads in the radius
 and length of a cylinder and computes the area and volume using the following
 formulas:
 area = radius * radius * p
 volume = area * length
 *
 * By Francis Miyoba on 10/feb/2018
 */
public class exercise02 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("Enter the radius and length of a cylinder: ");

        double radius = input.nextDouble() ;
        int length = input.nextInt() ;

        double area = radius * radius * Math.PI ;
        double volume = area * length ;

        System.out.print("Area is " + area + " Volume is " + volume );
    }
}
