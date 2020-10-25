package com.coding.businesslogic.patterns.strategy;

public class LoudQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack Quack >> Loudly");
    }
}
