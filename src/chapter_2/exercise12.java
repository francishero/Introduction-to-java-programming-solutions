package chapter_2;

import java.awt.*;
import java.util.Scanner;

/**
 *
 *  Write a program that prompts the user to enter v in meters/second (m/s) and the
 acceleration a in meters/second squared (m/s 2 ), and displays the minimum run-
 way length
 */
public class exercise12 {
    public static void main (String[] args) {
        Scanner input =new Scanner(System.in) ;

        System.out.print("Enter speed and acceleration: ");

        double speed = input.nextDouble() ;
        double acceleration =input.nextDouble() ;

        double minimumRunWayLength = (speed*speed) / (2*acceleration) ;

        System.out.print("The minimum runway length for this airplane is "+ minimumRunWayLength);
    }
}
