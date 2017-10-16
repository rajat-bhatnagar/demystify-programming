package com.coding.patterns.strategy;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Duck with Aeroplane wings");
    }
}
