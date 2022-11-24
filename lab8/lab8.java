package lab8;

import javax.sound.sampled.SourceDataLine;

public class lab8 {

  static void vertical_numbers_recursive(int n) {
    if (n < 10)
      System.out.println(n);
    else {
      vertical_numbers_recursive(n / 10); // all except the last digit
      System.out.println(n % 10); // last digit
    }
  }

  static void vertical_numbers_iterative(int n) {
    int X = (int) Math.pow(10, (((int) (Math.log10(n) + 1)) - 1));
    while (n != 0) {
      System.out.println(n / X);
      n = n % X;
      X /= 10;
    }
  }

  static int fibonacci_recursive(int n) {
    if (n == 0 || n == 1)
      return n;
    else
      return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2);
  }

  static final int max = 10000;
  static int[] cache = new int[max];

