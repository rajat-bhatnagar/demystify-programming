package com.coding.patterns.strategy;

public class LoudQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack Quack >> Loudly");
    }
}
