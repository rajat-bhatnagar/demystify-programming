package com.coding.java8.lambdas;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        Thread myLambdaThread = new Thread(() -> printMessage());
        myLambdaThread.start();

        //Instead of doing the above syntax
        // We can use the method reference syntax for
        //Lambda expression with a double colon ::
        //Rule is Call the CLASS_NAME :: METHOD_NAME

        Thread myLambdaMethodReference = new Thread(MethodReferenceDemo::printMessage);
        myLambdaMethodReference.start();
    }

    private static void printMessage() {
        System.out.println("Some arbitrary message");
    }
}
