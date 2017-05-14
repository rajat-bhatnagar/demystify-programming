package com.coding.java8.lambdas.functionalinterfaces;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

    public static void main(String[] args) {

        // Input of numbers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        // Have a key
        int key = 0;

        // Perform operations on the input of numbers based on the key
        process(numbers, key, wrapperLambda((v, k) -> System.out.println(v/k)));

    }

    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int number : numbers) {
            biConsumer.accept(number, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (k, v) -> {
            try {
                consumer.accept(k, v);
            } catch (ArithmeticException e) {
                System.out.println("Exception caught in wrapper lambda");
            }
        };
    }
}
