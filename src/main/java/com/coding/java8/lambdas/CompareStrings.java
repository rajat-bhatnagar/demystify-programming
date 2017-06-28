package com.coding.java8.lambdas;

import java.util.Comparator;

public class CompareStrings {
    public static void main(String[] args) {
      /*
       * if the body of the lambda requires more than one
       * the value returned from the expression can be handed back
       * with the return keyword
       */
        Comparator<String> comparator
                = (s1, s2) -> {
            System.out.println("Comparing "+s1 +" with "+s2);
            return s1.compareTo(s2);
        };

        int result = comparator.compare("Lion", "tiger");
        System.out.println(" String Comparison "+result);
    }
}
