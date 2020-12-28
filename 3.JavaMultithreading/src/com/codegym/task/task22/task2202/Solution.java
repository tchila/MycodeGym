package com.codegym.task.task22.task2202;

/* 
Find a substring

*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("CodeGym is the best place to learn Java."));
    }

    public static String getPartOfString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        if(string == null || string == " " || string.indexOf(" ")==-1)
            throw new StringTooShortException();
        String[] words = string.split(" ");
        if(words.length<5)
            throw new StringTooShortException();
        else {
            for (int j = 1; j < 5; j++) {
                stringBuilder.append(words[j]);
                stringBuilder.append(" ");
            }

        }
        return stringBuilder.toString().trim();
        /*int firstIndex  = string.indexOf(" ");
        int lastIndex = firstIndex;
        for (int i = 0; i < 4; i++) {
            lastIndex = string.indexOf(" ", lastIndex+1);
            if(lastIndex == -1)
                throw new StringTooShortException();

        }
       return string.substring(firstIndex+1,lastIndex);*/

    }

    public static class StringTooShortException extends RuntimeException {

    }
}