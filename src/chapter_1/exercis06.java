package chapter_1;

/**
 *   Write a program that displays the result of
  *   1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9
 *   by Francis Miyoba on 05/feb/2018
 */
public class exercis06 {
    public static void main (String[] args) {
        double sum = 0.0 ;
        for (int i = 0; i <= 9; i++) {
            sum+=i ;
        }
        System.out.println(sum);
    }

}
