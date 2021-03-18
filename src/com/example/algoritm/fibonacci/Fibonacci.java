package com.example.algoritm.fibonacci;

public class Fibonacci {

  public static long fibonacci(int n) {
    if (n <= 1)
      return n;
    else
      return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void main(String[] args) {
    int n = 7;
    for (int i = 1; i <= n; i++) {
      System.out.println(i + ": " + fibonacci(i));
    }

    ResultFib();
  }

  public static void ResultFib() {
    int fib[] = new int[7];

    for (int i = 0; i <fib.length; i++) {
      if (i == 0) fib[i] = 1;
      if (i == 1) fib[i] = 1;
      if (i > 1) fib[i] = fib[i - 1] + fib[i - 2];
      System.out.print(fib[i] + " ");
    }
  }
}