package com.coding.java8.businesslogic.impl;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class SampleStream {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("David", "Craig", "Noah", "Matt");

        //print the names uppercase , comma separated
        System.out.println(
                names.stream()
                        .map(String::toUpperCase)
                        .collect(joining(", ")));


    }
}


