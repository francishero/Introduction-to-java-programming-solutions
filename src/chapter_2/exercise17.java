package chapter_2;

import java.util.Scanner;

/**
 * Chapter 2 Exercise 17:
 *
 *      (Science: wind-chill temperature)
 *
 *
 */
public class exercise17 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        System.out.print("Enter the wind speed miles per hour: ");
        double speed = input.nextDouble();

        double windCold = 35.74 + 0.6215 * fahrenheit - 35.75 *
                Math.pow(speed, 0.16) + 0.4275 * fahrenheit *
                Math.pow(speed, 0.16);

        System.out.println("The wind chill index is " + windCold);
    }
}
