package com.coding.businesslogic.lambdas.functionalinterfaces;

import com.coding.businesslogic.lambdas.data.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceLambdaDemo {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Mike", "King", 44),
                new Person("David", "Homes", 55));

        /*
         * See how we use Lambda Method Reference in System.out : println to print names
         */
        printConditionally(people, p -> true, System.out::println);

    }

    public static void printConditionally(List<Person> persons, Predicate<Person> predicate,
                                          Consumer<Person> consumer) {
        for (Person person : persons) {
            if (predicate.test(person)) {
                consumer.accept(person);
            }
        }
    }
}
