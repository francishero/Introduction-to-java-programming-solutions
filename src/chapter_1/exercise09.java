package chapter_1;

/**
 *  Write a program that displays the area and
 perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following
 formula:
 area = width * height
 * By Francis Miyoba on 05/feb/2018
 *
 */
public class exercise09 {
    private static final double width = 4.5 ;
    private static final double height = 7.9 ;

    public static void main (String[] args) {
        double area = width * height ;
        double perimeter = width + width + height + height ;

        System.out.printf("%.1f * %.1f = %.1f\n", width, height, area) ;
        System.out.println("Perimeter==" + perimeter);
    }
}
