package com.coding.businesslogic;

import java.util.Arrays;
import java.util.List;

/**
 * demonstrates how this keyword is used in lambda expressions
 */
public class ThisInLambda {

    private static ThisInLambda INSTANCE = new ThisInLambda();
    private int aNumber = 100;
    private static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    public void doSomething() {
        numbers.forEach(x -> {
                    System.out.println(x + this.aNumber);
                    if (this == INSTANCE) {
                        System.out.println("Within the lambda body this" +
                                "just refers to enclosing object");
                    }
                }
        );
    }

    public static void main(String[] args) {
        INSTANCE.doSomething();
    }
}
