package com.coding.java8.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PrintUsingLambdaExpression {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4 ,5);
        System.out.println("########## forEach ##############");
        numbers.forEach(
                x -> System.out.println(x)
        );

        System.out.println("######## Method Reference ##############");
        //Method reference
        numbers.forEach(
                System.out::println
        );

        System.out.println("######### Consumer ###########");
        //Another way of doing this
        Consumer<Integer> number = x -> System.out.println(x);
        numbers.forEach(number);
    }
}
