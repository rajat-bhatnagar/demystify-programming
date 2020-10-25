package com.coding.businesslogic.lambdas;

public class ThisReferenceExample {

    public void doProcess(int i, Process p){
        p.process(i);
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        /*thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println(" Value of i is " +i);
                System.out.println(this);
            }
        });*/

        thisReferenceExample.doProcess(10, p ->
            System.out.println("Value of i is "+p));

        thisReferenceExample.execute();
    }

    void execute(){
        doProcess(10, p -> {
            System.out.println("Value of i is " + p);
            System.out.println(this);
        });
    }


    @Override
    public String toString() {
        return "This is a ThisReferenceExample class instance";
    }
}

interface Process {
    void process(int i);
}
