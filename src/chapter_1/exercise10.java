package chapter_1;

/**
 * Chapter 1 Exercise 10:
 *
 *      (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30 seconds.
 *       Write a program that displays the average speed in miles per hour.
 *      (Note that 1 mile is 1.6 kilometers.)
 *
 * Created by Francis Miyoba on 05/feb/2018
 */

public class exercise10 {
    public static void main (String[] args) {
        double kilometers = 14.0 ;
        double miles = kilometers / 1.6 ;
        // 1 minute = 60 seconds
        // convert 45 minutes to seconds and add 30 seconds
        // convert the whole thing to hours
        // 1 hour has 60 minutes, 60 minutes has 60 seconds
        // so 1 hour has 60*60 seconds
        double rate = (45.0 * 60.0 + 30.0) / (60.0 * 60.0) ;

        double average_speed = miles / rate ;
        System.out.println(average_speed);

    }
}
