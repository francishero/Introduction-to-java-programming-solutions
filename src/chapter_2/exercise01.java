package chapter_2;

import java.util.Scanner;

/**
 *
 * a program that reads a Celsius degree in
 a double value from the console, then converts it to Fahrenheit and displays the
 result. The formula for the conversion is as follows:
 fahrenheit = (9 / 5) * celsius + 32
 *
 * By Francis Miyoba on 10/feb/2018
 */
public class exercise01 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("Enter temperature in celsius: ");

        double tempCelsius = input.nextDouble() ;

        // integer division here will cause a bug
        double tempFahrenheit = (9 / 5.0) * tempCelsius + 32 ;
        System.out.println("Temperature in fahrenheit: " + tempFahrenheit);
    }
}
