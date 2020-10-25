package com.coding.businesslogic;

public class InnerClassesDemo {
    public static void main(String[] args) {
        InstanceOuter io = new InstanceOuter(12);
        InstanceOuter.InstanceInner in = io.new InstanceInner();
        in.doSomething();

        StaticOuter.StaticInner si = new StaticOuter.StaticInner();
        si.doSomething();
    }
}
