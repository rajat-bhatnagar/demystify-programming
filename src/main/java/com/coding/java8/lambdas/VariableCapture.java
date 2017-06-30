package com.coding.java8.lambdas;

import java.util.Arrays;
import java.util.List;

/**
 * The class demonstrates that the lambdas can interact with variables
 * defined outside the body of the lambda.
 */
public class VariableCapture {
    public static void main(String[] args) {
        int aNumber = 10;
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        System.out.println(" Demonstrating Variable Recapture ");
        numbers.forEach(
                x -> System.out.println(x * aNumber )
        );

    }
}
