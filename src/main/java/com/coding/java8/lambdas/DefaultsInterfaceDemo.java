package com.coding.java8.lambdas;

public interface DefaultsInterfaceDemo {

    /*
     * Implementation in an interface is possible
     * by using default keyword
     */
    default void land(){
        System.out.println("DefaultsInterfaceDemo::land");
    }

    default void turn() {
        System.out.println("DefaultsInterfaceDemo::turn");
    }

    default void fly(){
        System.out.println("DefaultsInterfaceDemo::fly");
    }
}
