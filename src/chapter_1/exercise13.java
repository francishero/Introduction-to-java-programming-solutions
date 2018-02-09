package chapter_1;

/**
 *
 * ax + by = e
 cx + dy = f
 x =ed - bf/ad - bc
 y =af - ec/ad - bc
 Write a program that solves the following equation and displays the value for x and y:
 3.4x + 50.2y = 44.5
 2.1x + .55y = 5.9
 *
 * By Fracis Miyoba on 07/feb/2018
 */
public class exercise13 {
    public static void main (String[] args) {
        double a = 3.4;
        double b = 50.2;
        double c = 2.1 ;
        double d = 0.55 ;
        double e = 44.5 ;
        double f = 5.9 ;

        double x = (e*d- b*f) / (a*d - b*c) ;
        double y = (a*f - e*c) / (a*d - b*c);

        System.out.print("x==" + x+ " " + "y==" + y);
    }
}
