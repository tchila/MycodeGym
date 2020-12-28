package com.codegym.task.task39.task3901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/* 
Unique substrings

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your string: ");
        String s = bufferedReader.readLine();

        System.out.println("The longest unique substring length is: \n" + lengthOfLongestUniqueSubstring(s));
    }

    public static int lengthOfLongestUniqueSubstring(String s) {
       if(s == null)
           return 0;
        int result = 0;
        Set<Character> string  = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(!string.contains(Character.valueOf(s.charAt(i))))
                string.add(Character.valueOf(s.charAt(i)));
            else {
                if(result < string.size())
                    result = string.size();
                string.clear();
                i--;
            }
        }
        if(result < string.size())
            result = string.size();
        return result;


    }
}
