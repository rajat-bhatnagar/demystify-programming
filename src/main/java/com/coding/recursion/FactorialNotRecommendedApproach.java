package com.coding.recursion;

public class FactorialNotRecommendedApproach {
    public static void main(String[] args) {
        for(int i=0;i<25;i++){
            System.out.println("FactorialNotRecommendedApproach "+i+" = "+factorial(i));
        }
    }

    private static int factorial(int i) {
        if (i < 2){
            return 1;
        }
        return i * factorial(i - 1);
    }

    //TODO
    // Implement Factorial Calculation by a better algorithm
    // which performs better - Look at the inconsistent negative
    // values for the factorial below
    /*
    FactorialNotRecommendedApproach 17 = -288522240
    FactorialNotRecommendedApproach 18 = -898433024
    FactorialNotRecommendedApproach 20 = -2102132736
    FactorialNotRecommendedApproach 21 = -1195114496
    FactorialNotRecommendedApproach 22 = -522715136
    FactorialNotRecommendedApproach 24 = -775946240
    */



}
