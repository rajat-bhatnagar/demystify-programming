package com.coding.businesslogic.lambdas;

import com.coding.businesslogic.lambdas.data.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sort people by last name.
 */
public class ComparatorLambdaExpression {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Gun", "Kli", 21),
                new Person("Sam", "Bha", 26),
                new Person("Ani", "Ham", 24),
                new Person("Sar", "Vai", 27)
        );

        //The old way
                Collections.sort(persons, new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getLastName().compareTo(o2.getLastName());
                    }
                });
        System.out.println("# Sort Collection by surname #");
        persons.forEach(System.out::println);

        // The lambda expression way

        System.out.println("# Sort Collection by firstName # the Lambda way");
        Collections.sort(persons,
                (person1, person2) -> person1.getFirstName().compareTo(person2.getFirstName()));
        persons.forEach(System.out::println);


    }
}
