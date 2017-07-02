package com.coding.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * This program demonstrates Search Terminal Operation
 */
public class SearchTerminalOperation {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5 , 6);
        Optional<Integer> result;

        // Find the first element
        result = integers.stream().findFirst();
        System.out.println("# First element in stream # "+result.get());

        // Any element in stream
        result = integers.stream().findAny();
        System.out.println("# Any Element in Stream # "+result.get());

        //Find a match for an element
        boolean isMatchFound = integers.stream().anyMatch(x -> x == 89);
        System.out.println("# Is match found for Integer 89 # "+ isMatchFound);
    }
}
