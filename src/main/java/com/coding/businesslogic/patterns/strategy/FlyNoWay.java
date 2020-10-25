package com.coding.businesslogic.patterns.strategy;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Duck does not fly");
    }
}
