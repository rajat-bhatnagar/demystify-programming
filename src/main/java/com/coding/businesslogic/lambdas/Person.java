package com.coding.businesslogic.lambdas;

import java.util.Comparator;

/*
 * Create Custom Comparators to sort a person by first name, last name and age
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public final static Comparator<Person> compareUsingFirstName =
            (lhs, rhs) -> lhs.getFirstName().compareTo(rhs.getFirstName());

    public final static Comparator<Person> compareUsingLastName =
            (lhs, rhs) -> lhs.getLastName().compareTo(rhs.getLastName());

    public final static Comparator<Person> compareUsingAge =
            (lhs,rhs) -> {
                if (lhs.getAge() > rhs.getAge()){
                    return 1;
                }
                if (lhs.getAge() < rhs.getAge()){
                    return -1;
                }
                return 0;
            };

}
