package chapter_2;

import java.util.Scanner;

public class practice {
  public static boolean less (Comparable v, Comparable w) {
      return v.compareTo(w) < 0 ;
  }

  public static void exch (Comparable[] a, int i, int j) {
      Comparable temp = a[i] ;
      a[i] = a[j] ;
      a[j] = temp ;
  }

  public static void sort (Comparable[] a) {
      int N = a.length ;
      for (int i = 0; i < N; i++) {
          int minValue = i ;
          for (int j = i+1 ; j < N ; j++) {
              if (less(a[j], a[minValue]))
                  minValue = j ;
          }
          exch(a, i, minValue);
      }
  }

  public static void main (String[] args) {

  }
}
