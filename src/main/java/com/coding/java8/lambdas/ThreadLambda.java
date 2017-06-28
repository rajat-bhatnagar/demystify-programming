package com.coding.java8.lambdas;

public class ThreadLambda {

    public static void main(String[] args) {
        Runnable r  = () -> System.out.println("My Lambda Thread");
        r.run();

        Thread myLambdaThread = new Thread(() -> System.out.println("My thread"));
        myLambdaThread.start();
    }
}
