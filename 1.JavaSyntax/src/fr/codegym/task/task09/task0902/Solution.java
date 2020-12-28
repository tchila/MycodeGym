package fr.codegym.task.task09.task0902;

/* 
La trace de pile, revisitée
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        methode1();

    }

    public static String methode1() {
        methode2();
        //écris ton code ici
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();

        return stackTraceElement[2].getMethodName();
    }

    public static String methode2() {
        methode3();
        //écris ton code ici
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement[2].getMethodName();
    }

    public static String methode3() {
        methode4();
        //écris ton code ici
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();

        return stackTraceElement[2].getMethodName();
    }

    public static String methode4() {
        methode5();
        //écris ton code ici
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement[2].getMethodName();

    }

    public static String methode5() {
        //écris ton code ici
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement[2].getMethodName();
    }
}
