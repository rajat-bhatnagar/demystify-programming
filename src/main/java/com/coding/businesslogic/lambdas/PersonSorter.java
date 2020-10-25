package com.coding.businesslogic.lambdas;

import com.coding.businesslogic.lambdas.data.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonSorter {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Sherlock", "Holmes", 21),
                new Person("Charles", "Dickens", 26),
                new Person("Lewis", "Carroll", 24),
                new Person("Thomas", "Carlyle", 27)
        );

        // Sort list by last name

        List<Person> sortedByLastNames = sortByLastName(persons);

        // Sort list by last name using lambda expression
        Collections.sort(persons, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Create a method that prints all name in list
        // Create a method that prints all people that have last name beginning with C

        System.out.println(" ###### People in myList ###### ");
        printConditionally(persons, p -> true);
        System.out.println(" ######  People Whose Name start with C ###### ");
        printConditionally(sortedByLastNames, p -> p.getLastName().startsWith("C"));
    }

    private static void printConditionally(List<Person> persons, Condition condition) {
        for(Person person: persons){
            if(condition.evaluatePrintCondition(person)) {
                System.out.println(person);
            }
        }
    }

    private static List<Person> sortByLastName(List<Person> persons) {
        if(!persons.isEmpty()){
            Collections.sort(persons, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    return o1.getLastName().compareTo(o2.getLastName());
                }
            });
        }
        return persons;
    }
}
