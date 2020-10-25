package com.coding.businesslogic;

public class StaticOuter {
    private static int x = 24;

    static class StaticInner {
        public void doSomething(){
            System.out.println("The value of x is : "+x);
        }
    }
}
