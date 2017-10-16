package com.coding.patterns.strategy;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new FlyNoWay(), new MuteQuack());
    }

    @Override
    void display() {
        System.out.println("My display :: RubberDuck");
    }
}
