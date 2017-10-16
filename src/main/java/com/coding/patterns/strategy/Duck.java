package com.coding.patterns.strategy;

public abstract class Duck {
    /*
     * Ducks may fly or quack
     * This is behavior that may change
     * Utilize Strategy Pattern and use composition for behavior that varies
     */
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackBehavior.quack();
    }

    /*
     * All Ducks swim but we leave it to them how to swim
     */
    abstract void display();

    /*
     * We know how any duck would swim
     */

    void swim(){
        System.out.println("I am a duck who knows swimming");
    }

}
