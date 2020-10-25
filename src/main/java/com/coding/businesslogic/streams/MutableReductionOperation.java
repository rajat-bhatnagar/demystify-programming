package com.coding.businesslogic.streams;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This program demonstrates a Mutable Reduction Operation
 */
public class MutableReductionOperation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5 , 5);
        Set<Integer> setOfNumbers = numbers.stream().collect(Collectors.toSet());
        System.out.println(" # Set of Numbers # "+setOfNumbers);
        System.out.println("# Set of Numbers is of type # "+setOfNumbers.getClass().getTypeName());

        //We can also specify which kind of Collection Type we want to have
        Set<Integer> treeSetOfIntegers = numbers.stream().collect(Collectors.toCollection(TreeSet::new));
        System.out.println("# treeSetOfIntegers # "+ treeSetOfIntegers);
        System.out.println("# treeSetOfIntegers is of type # "+treeSetOfIntegers.getClass().getTypeName());
    }
}
