package com.codegym.task.task30.task3009;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
Palindrome?

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getRadix("112"));        // Expected output: [3, 27, 13, 15]
        System.out.println(getRadix("123"));        // Expected output: [6]
        System.out.println(getRadix("5321"));       // Expected output: []
        System.out.println(getRadix("1A"));         // Expected output: []
    }

    private static Set<Integer> getRadix(String s) {
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i <= 36; i++) {
            try {
            Integer k = Integer.parseInt(s, 10);
            String convertedNumber = k.toString(k,i);
            StringBuilder builder = new StringBuilder(convertedNumber);

            if(builder.toString().equals(builder.reverse().toString()))
                set.add(i);
            } catch (NumberFormatException ignored) {
                return Collections.emptySet();
            }
        }
        return set;
    }
}