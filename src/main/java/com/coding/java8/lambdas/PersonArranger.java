package com.coding.java8.lambdas;

import java.util.Arrays;

public class PersonArranger {
    public static void main(String[] args) {
        Person person1 = new Person("Rishi", "Bhatnagar", 74);
        Person person2 = new Person("Praveen", "Bhatnagar", 67);
        Person person3 = new Person("Amitabh", "Zebra", 24);

        Person[] people = {person1,person2,person3};

        Arrays.sort(people, Person.compareUsingFirstName);
        for(Person p : people){
            System.out.println(p);
        }
        System.out.println("#################################");
        Arrays.sort(people, Person.compareUsingLastName);
        for(Person p : people){
            System.out.println(p);
        }
        System.out.println("#################################");
        Arrays.sort(people, Person.compareUsingAge);
        for(Person p : people){
            System.out.println(p);
        }
    }
}
