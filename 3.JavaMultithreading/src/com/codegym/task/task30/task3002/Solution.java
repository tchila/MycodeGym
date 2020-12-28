package com.codegym.task.task30.task3002;

/* 
Mastering the methods of the Integer class

*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(convertToDecimalSystem("0x16")); // 22
        System.out.println(convertToDecimalSystem("012"));  // 10
        System.out.println(convertToDecimalSystem("0b10")); // 2
        System.out.println(convertToDecimalSystem("62"));   // 62
    }

    public static String convertToDecimalSystem(String s) {
        //write your code
        if(s.charAt(0) == '0' && s.charAt(1) == 'b') {
            Integer i = Integer.parseInt(s.substring(2), 2);
            return i.toString();
        } else if(s.charAt(0) == '0' && s.charAt(1) == 'x') {
            Integer i = Integer.parseInt(s.substring(2), 16);
            return i.toString();
        } else if(s.charAt(0) == '0'){
            Integer i = Integer.parseInt(s.substring(1), 8);
            return i.toString();
        }else {
            Integer i = Integer.parseInt(s, 10);
            return i.toString();
        }
    }
}
