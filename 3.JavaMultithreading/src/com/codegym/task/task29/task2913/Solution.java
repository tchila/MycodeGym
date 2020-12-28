package com.codegym.task.task29.task2913;

import java.util.Random;

/* 
Replace recursion

*/

public class Solution {
    private static int numberA;
    private static int numberB;

    public static String getAllNumbersBetween(int a, int b) {
        StringBuilder sb = new StringBuilder();
        sb.append(a); // add a
   /*if (a == b){
         return Integer.toString(a);
   }*/
        if (a > b)
            for (int i = a - 1; i >= b; i--)// change here
                sb.append(" " + i);
        else if (a < b)
            for (int i = a + 1; i <= b; i++) // change here
                sb.append(" " + i);

        return sb.toString(); // no need to trim
    }

    public static void main(String[] args) {
        Random random = new Random();
        numberA = random.nextInt(1000);
        numberB = random.nextInt(1000);
        System.out.println(getAllNumbersBetween(numberA, numberB));
        System.out.println(getAllNumbersBetween(numberB, numberA));
    }
}