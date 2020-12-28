package com.codegym.task.task22.task2203;

/* 
Between tabs

*/
public class Solution {
    public static String getPartOfString(String string) throws StringTooShortException {

        if(string == null || string == " " || string.indexOf("\t")==-1)
            throw new StringTooShortException();
        int first = string.indexOf("\t");
        int second = string.indexOf("\t",first+1);
        if(second == -1)
            throw  new StringTooShortException();
        else
            return string.substring(first+1,second);
    }

    public static class StringTooShortException extends Exception {

    }

    public static void main(String[] args) throws StringTooShortException {
        System.out.println(getPartOfString("\tCodeGym is the best place \tto learn Java\t."));
    }
}