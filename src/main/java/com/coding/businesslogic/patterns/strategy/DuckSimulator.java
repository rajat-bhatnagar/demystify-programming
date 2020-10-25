package com.coding.businesslogic.patterns.strategy;

public class DuckSimulator {
    public static void main(String[] args) {
        // A rubber ducks s default behavior of not flying being mute
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.swim();
        rubberDuck.quack();
        rubberDuck.fly();
        rubberDuck.display();
        System.out.println(" ## Change behavior at runtime : Make rubber duck fly and quack loudly ##");
        
        //Make a Rubber duck fly
        RubberDuck loudAndFlyingRubberDuck = new RubberDuck();
        loudAndFlyingRubberDuck.setFlyBehavior(new FlyWithWings());
        loudAndFlyingRubberDuck.setQuackBehavior(new LoudQuack());
        loudAndFlyingRubberDuck.fly();
        loudAndFlyingRubberDuck.quack();
        loudAndFlyingRubberDuck.display();
    }
}
