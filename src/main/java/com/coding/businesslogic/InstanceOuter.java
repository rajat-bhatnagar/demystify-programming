package com.coding.businesslogic;

public class InstanceOuter {
    private int x;

    public InstanceOuter(int xx) {
        this.x = xx;
    }

    class InstanceInner {
        public void doSomething(){
            System.out.println("The value of x is "+x);
        }
    }
}
