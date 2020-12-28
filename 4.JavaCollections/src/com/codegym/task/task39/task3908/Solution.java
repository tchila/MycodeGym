package com.codegym.task.task39.task3908;

/* 
Is a palindrome possible?

*/

public class Solution {
    public static void main(String[] args) {

    }

    public static boolean isPalindromePermutation(String s) {
        if(s ==  null || s.length() == 0)
            return true;

        s = s.toLowerCase();
        s = s.replace(" ", "");

        boolean[] odds = new boolean[256];

        for (int i = 0; i < s.length(); i++) {
            odds[s.charAt(i)] =! odds[s.charAt(i)];
        }
        int numOdds = 0;

        for (int i = 0; i < odds.length ; i++) {
            if(odds[i]){
                numOdds++;
            }

            if(numOdds>1)
                return false;
        }
        return true;
    }
}
