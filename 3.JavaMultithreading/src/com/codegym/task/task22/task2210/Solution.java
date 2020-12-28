package com.codegym.task.task22.task2210;

import java.util.*;

/*
StringTokenizer

*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getTokens("level22.lesson13.task01", "."));

    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query,"\\"+delimiter);
        List<String> list = new ArrayList<>();
        while (tokenizer.hasMoreTokens()){
            list.add(tokenizer.nextToken());
        }
        String[] array = new String[list.size()];
        return list.toArray(array);
    }
}
