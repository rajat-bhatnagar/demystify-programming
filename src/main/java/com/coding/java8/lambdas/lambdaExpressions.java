package com.coding.java8.lambdas;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

public class lambdaExpressions {
    public static void main(String[] args) {
        Runnable noArguments = () -> System.out.println("No Arguments");
        ActionListener oneArgument = event -> System.out.println("Button Clicked");
        BinaryOperator<Long> add = (x, y) -> x + y;
        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;
    }
}
