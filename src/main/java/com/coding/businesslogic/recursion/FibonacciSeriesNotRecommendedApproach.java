package com.coding.businesslogic.recursion;

import java.util.Scanner;

public class FibonacciSeriesNotRecommendedApproach {

    /*
     * Write a function int fib(int n) that returns Fn.
      * For example, if n = 0, then fib() should return 0.
      * If n = 1, then it should return 1.
      * For n > 1, it should return Fn-1 + Fn-2
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Fibonacci Sum - f(n-1) + f(n-2) = "+fib(n));
    }

    private static int fib(int n){
        if (n == 0){
            return 0;
        }
        if (n < 2){
            return 1;
        }
        return fib(n - 1) + fib(n -2);
    }
}
