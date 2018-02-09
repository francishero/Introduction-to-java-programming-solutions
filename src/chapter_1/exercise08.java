package chapter_1;

/**
 *  Write a program that displays the area and perim-
 eter of a circle that has a radius of 5.5 using the following formula:
 perimeter = 2 * radius * pi
 area = radius * radius * pi
 */
public class exercise08 {

    private static final double radius = 5.5 ;
    public static void main (String[] args) {

        double perimter = 2 * radius * Math.PI ;
        double area = radius * radius * Math.PI ;

        System.out.println("Perimeter==" + perimter);
        System.out.println("Area==" + area);
    }
}

