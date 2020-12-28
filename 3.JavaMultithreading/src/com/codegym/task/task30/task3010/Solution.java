package com.codegym.task.task30.task3010;

/* 
Smallest possible radix

*/

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        try {

            String str = args[0].toUpperCase();
            int max = -1;
            for (int i = 2; i < 37; i++) {
                try {
                    BigInteger integ = new BigInteger(str, i);
                    max = i;
                    System.out.println(max);
                    break;
                } catch (Exception e) {
                }
            }

            if (max == -1) {
                System.out.println("Invalid");
            }
        } catch (Exception e) {

        }
    }
}