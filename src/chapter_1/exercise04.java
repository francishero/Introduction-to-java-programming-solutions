package chapter_1;

/**
 * Chapter 1 Exercise 4:
 *      (Print a table) Write a program that displays the following table:
 *
 *      a   a^2 a^3
 *      1   1   1
 *      ....
 *      4   16  64
 *
 * Created by Francis Miyoba on 03/feb/2018.
 */

public class exercise04 {
    public static void main (String[] args) {
        System.out.printf("%5s  |%5s  |%5s\n", "a", "a^2", "a^3");
        for (int i = 1; i < 5; i++) {
            System.out.printf("%3d | %5d  |%5d\n",i, i*i, i*i*i);
        }
    }
}
