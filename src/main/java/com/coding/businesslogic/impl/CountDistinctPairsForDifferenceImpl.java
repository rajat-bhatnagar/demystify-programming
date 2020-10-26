package com.coding.businesslogic.impl;

import com.coding.businesslogic.CountDistinctPairsForDifference;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountDistinctPairsForDifferenceImpl implements CountDistinctPairsForDifference {

    @Override
    public int findDistinctPairsForDifferenceByBruteForce(int[] arr, int k) {
        int[] inputArray = removeDuplicates(arr);
        System.out.println("Removed Duplicates if any " + Arrays.toString(inputArray));
        int pairCount = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (Math.abs(arr[j] - arr[i]) == k) {
                    pairCount++;
                    System.out.println("Pair found (" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
        System.out.println("Number of distinct unique pairs having a difference of " + k + " are " + pairCount);
        return pairCount;
    }

    public static void main(String[] args) {
        int[] input = {1, 5, 3, 4, 2, 4, 4};
        int difference = 3;
        new CountDistinctPairsForDifferenceImpl().findDistinctPairsForDifferenceByBruteForce(input, difference);
        int[] inputA = {8, 12, 16, 4, 0, 20};
        int differenceA = 4;
        new CountDistinctPairsForDifferenceImpl().findDistinctPairsForDifferenceByBruteForce(inputA, differenceA);
    }

    private int[] removeDuplicates(int[] arr) {
        return IntStream.of(arr)
                .boxed()
                .sorted()
                .collect(Collectors.toSet())
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
