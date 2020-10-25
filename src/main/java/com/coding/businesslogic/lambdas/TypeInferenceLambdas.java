package com.coding.businesslogic.lambdas;

public class TypeInferenceLambdas {

    public static void main(String[] args) {
        StringLengthLambda myLambda = s -> s.length();
        System.out.println(myLambda.getLength("Lambda Expressions"));
        printStringLambda(s -> s.length());
    }

    public static void printStringLambda(StringLengthLambda s){
        System.out.println(s.getLength("Lambda Expressions"));
    }

    interface StringLengthLambda {
        int getLength(String input);
    }
}
