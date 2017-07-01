package com.coding.java8.streams;

import java.util.stream.LongStream;

/**
 * Generate a long stream from 0 to 10
 */
public class StreamSource {

    public static void main(String[] args) {
        System.out.println("# Creating a long stream #");
        LongStream.range(0,10).forEach(
                System.out::println
        );
    }
}
