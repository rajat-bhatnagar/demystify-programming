package com.coding.businesslogic.impl;

import com.coding.businesslogic.FizzBuzzPrinter;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzPrinterImpl implements FizzBuzzPrinter {

    @Override
    public void printFizzBuzzNumber(int max) {
        printFizzBuzz(max);
    }

    private void printFizzBuzz(int max) {
        List<String> fizzBuzzNumbers = new ArrayList<>();
        for (int counter = 1; counter <= max; counter++) {
            fizzBuzzNumbers.add(getFizzBuzzNumber(counter));
        }
        System.out.println(fizzBuzzNumbers);

    }

    private String getFizzBuzzNumber(int input) {
        if (((input % 3) == 0) && ((input % 5) == 0)) {
            return "FizzBuzz";
        } else if ((input % 3) == 0) {
            return "Fizz";
        } else if ((input % 5) == 0) {
            return "Buzz";
        } else {
            return Integer.toString(input);
        }
    }

    public static void main(String[] args) {
        new FizzBuzzPrinterImpl().printFizzBuzzNumber(15);
    }

}
