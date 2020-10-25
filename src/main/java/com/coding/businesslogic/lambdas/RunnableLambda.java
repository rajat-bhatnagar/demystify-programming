package com.coding.businesslogic.lambdas;

public class RunnableLambda {

    public static void main(String[] args) {

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running myThread");
            }
        });

        myThread.start();

    /*
     * Instead of having the above boiler plate code
     * we can just create a lambda expression
     * as Runnable interface has one abstract method
     *
     */

        Thread lambdaThread = new Thread(() -> System.out.println("Running lambdaThread"));
        lambdaThread.start();
    }

}
