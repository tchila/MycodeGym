package com.codegym.task.task22.task2212;

/* 
Phone number verification

*/
public class Solution {
    public static boolean checkPhoneNumber(String phoneNumber) {
        if(phoneNumber == null || phoneNumber.isEmpty())
            return false;
        return phoneNumber.matches("[+]\\d{12}|[+]\\d{2}\\(\\d{3}\\)\\d{7}|[+]\\d{8}(?:-\\d{2}){2}||\\d{6}(?:-\\d{4}-)");
    }

    public static void main(String[] args) {



    }
}
