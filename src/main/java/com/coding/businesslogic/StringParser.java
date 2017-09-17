package com.coding.businesslogic;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Write a program to parse a String
 * Illustrate the Anti-Pattern because of lack of knowledge of API
 * and the Correct way of doing it
 */
public class StringParser {
    private static final String input = "Sneakers, Sandals , Heels, Boots, Flats, Plum";
    private static final String delimiter = ",";

    public static void main(String[] args) {
        if(input.isEmpty() || delimiter.isEmpty()){
            return;
        }
        String[] chunks = getStringChunks(input, delimiter);
        System.out.println("######## Anti Pattern : ACCIDENTAL COMPLEXITY ########");
        for(String chunk : chunks){
            System.out.println(chunk);
        }

        /*
         * The above code works but is a anti pattern because it is verbose
         * and has a lot of accidental complexity
         *
         * This Could have been done in a really simple way by using the split method provided by the API
         * NOTE : We don't know what we don't know but take ime to learn the language
         */

        System.out.println("######## Correct way ##########");
        String[] correctWayToGetChunks = input.split(delimiter);
        for(String s : correctWayToGetChunks){
            System.out.println(s);
        }
    }

    private static String[] getStringChunks(String input, String delimiter) {
        List<String> chunksInInput = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(input, delimiter);
            while (st.hasMoreTokens()){
                chunksInInput.add(st.nextToken());
            }
           String[] chunks = new String[chunksInInput.size()];
           chunksInInput.toArray(chunks);
        return chunks;
    }
}
