package com.coding.businesslogic.impl;

import com.coding.businesslogic.ArrayRotator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayRotatorImpl implements ArrayRotator {
    /*
     ** arr =[1, 2 , 3 , 4, 5]
     *  d = 2
     *  n = 5
     */

    public ArrayList<Integer> rotateArray(Integer[] arr, int d, int n){
        ArrayList<Integer> tempList = new ArrayList<>();
        ArrayList<Integer> rotatedList = new ArrayList<>();
        if(arr.length == 0){
            System.out.println("Input Integer Array is - EMPTY");
            return rotatedList;
        } else{
            if( d > n){
                System.out.println("Cannot rotate an array greater than its size - RETRY");
                return rotatedList;
            }
            /*
             * Rotate the array
             */
            Integer[] temp = new Integer[d];
            for(int i=0;i<arr.length - 1;i++){
                if(i <= d){
                    tempList.add(arr[i]);
                } else{
                    rotatedList.add(arr[i]);
                }
            }
        }

        return rotatedList;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> numbers = Arrays.asList(arr);
        System.out.println("numbers : "+numbers);
        System.out.println("Rotate by 2 " +new ArrayRotatorImpl().rotateArray(arr, 2, arr.length));


    }
}
