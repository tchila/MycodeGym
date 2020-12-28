package com.codegym.task.task39.task3909;

/* 
One change

*/

public class Solution {
    public static void main(String[] args) {

    }

    public static boolean isOneEditAway(String first, String second) {
        int diff = Math.abs(first.length() - second.length());

        if(diff>1)
            return false;
        if(first.equals("") && second.equals(""))
            return true;
        if(first.equals(second))
            return true;
        if(first.length() == second.length()){
            for (int i = 0; i < first.length(); i++) {
                StringBuilder stringBuilder = new StringBuilder(first);
                StringBuilder stringBuilder1 = new StringBuilder(second);
                if(stringBuilder.deleteCharAt(i).toString()
                .equals(stringBuilder1.deleteCharAt(i).toString()))
                    return true;

            }
        }

        if(first.length() > second.length()){
            for (int i = 0; i < first.length(); i++) {
                StringBuilder stringBuilder = new StringBuilder(first);
                if(stringBuilder.deleteCharAt(i).toString()
                        .equals(second))
                    return true;

            }
        }

        if(first.length() < second.length()){
            for (int i = 0; i < second.length(); i++) {
                StringBuilder stringBuilder = new StringBuilder(second);
                if(stringBuilder.deleteCharAt(i).toString()
                        .equals(first))
                return true;

            }
        }
        return false;
    }
}
