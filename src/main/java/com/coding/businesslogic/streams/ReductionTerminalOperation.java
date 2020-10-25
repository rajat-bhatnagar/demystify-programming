package com.coding.businesslogic.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * This program illustrates reduction terminal operations
 * Reduction Terminal Operations return a Single result
 */
public class ReductionTerminalOperation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2 , 3 ,4 , 5);

        //Count number of numbers
        long count = numbers.stream().mapToInt(Integer::intValue).count();
        System.out.println("# Numbers Count # "+count);

        // Find minimum number
        Optional<Integer> minimumNumber = numbers.stream().min(Comparator.comparingInt(x -> x));
        System.out.println("# Minimum Number # "+minimumNumber.get());

        // Find maximum number
        Optional<Integer> maximumNumber = numbers.stream().max(Comparator.comparingInt(x -> x));
        System.out.println("# Maximum Number # "+maximumNumber.get());

        //find sum
        int sum = numbers.stream().reduce(0, (x,y) -> x+y);
        System.out.println("# Sum # "+sum);
    }
}
