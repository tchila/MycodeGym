package com.codegym.task.task37.task3703;

/* 
Find the class by its description

*/

import java.util.concurrent.ConcurrentSkipListMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getExpectedClass());
    }

    public static Class getExpectedClass() {
        return ConcurrentSkipListMap.class;
    }
}
