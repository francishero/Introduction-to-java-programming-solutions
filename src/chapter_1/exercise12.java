package chapter_1;

/**
 * Assume a runner runs 24 miles in 1 hour, 40  minutes,
 and 35 seconds. Write a program that displays the average speed in kilometers per
 hour. (Note that 1 mile is 1.6 kilometers.)
 *
 * By Francis Miyoba on 07/feb/2018
 */
public class exercise12 {

    public static void main (String[] args) {
        double carSpeedMiles = 24.0 ;
        // convert the time to hours 1 hour + 40 minutes / 60 minutes in an hour + 35 / 3600 seconds in an hour
        double carTimeHours = 1 + 40/60.0 + 35.0/ (60*60) ;
        // used 1.60934 as it is more accurate
        double carSpeedKm = carSpeedMiles * 1.60934 ;

        // standard average_speed formula distance/time
        double average_speed = carSpeedKm / carTimeHours ;
        System.out.println(average_speed);
    }
}
