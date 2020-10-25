package com.coding.businesslogic.lambdas.functionalinterfaces;

import com.coding.businesslogic.lambdas.data.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonSorterPredicateConsumerDemo {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Sherlock", "Holmes", 21),
                new Person("Charles", "Dickens", 26),
                new Person("Lewis", "Carroll", 24),
                new Person("Thomas", "Carlyle", 27)
        );

        // Sort list by last name using lambda expression
        Collections.sort(persons, (p1 , p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Create a method that prints all name in list
        System.out.println(" ###### People in myList ###### ");
        performPrintConditionally(persons, p -> true, p-> System.out.println(p));
        System.out.println();

        // Create a method that prints all people that have last name beginning with C
        performPrintConditionally(persons, p -> p.getLastName().startsWith("C"), p-> System.out.println(p));

        System.out.println(" ######  People Whose Name start with C ###### ");
    }

    public static void performPrintConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
        for(Person person : people){
            if(predicate.test(person)){
                consumer.accept(person);
            }
        }
    }
}
