package com.coding.java8.lambdas.functionalinterfaces;

public class ClojureDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //Compiler freezes the value of b and treats it as a final value
        //as it is being used and passed around in the lambda expression
        doProcess(a, i -> System.out.println(i + b));

    }

public static void doProcess(int i, Process p){
    p.process(i);
}

}

interface Process {
    void process(int i);
}
