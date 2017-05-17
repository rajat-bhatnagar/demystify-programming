package com.coding.java8.lambdas;

import com.coding.java8.lambdas.data.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationForEachDemo {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("Mike", "King", 44),
                new Person("David", "Homes", 55));

        /*
         * This is internal iterator using forEach
         * which is read as for each person in people
         * go ahead and execute my lambda which in this case
         * is a method reference to print all elements
         * The beauty of this lies because this is multi-threaded
         * and does not need to be run sequentially
         */
        people.forEach(System.out::println);
    }
}
