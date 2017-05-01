package com.coding.java8.lamdas;

public class GreetingLambda {

    public static void main(String[] args) {
        Greeting addFunction = (int a, int b) -> a + b;
        System.out.println(addFunction.addNumbers(12, 13));
    }
}
