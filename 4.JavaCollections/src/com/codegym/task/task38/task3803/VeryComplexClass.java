package com.codegym.task.task38.task3803;

/* 
Runtime exceptions (unchecked exceptions)

*/

public class VeryComplexClass {
    public void methodThrowsClassCastException() {
        Object o = new Long(0);
        String s = (String) o;
    }

    public void methodThrowsNullPointerException() {
        String s = null;
        s.length();
    }

    public static void main(String[] args) {

    }
}