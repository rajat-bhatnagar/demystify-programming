package com.coding.recursion;

public class DigitalRoot {

    public static void main(String[] args) {
        for(int number=0;number<31;number++){
            System.out.println("Digital Root of "+number+ " is = "+evaluateDigitalRoot(number));
        }
    }

    private static int evaluateDigitalRoot(int n) {
        if (n < 10){
            return n;
        }
        return n%9 == 0 ? 9 : n%9;
    }
}
