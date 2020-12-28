package fr.codegym.task.task09.task0901;

/* 
Renvoyer la trace d'une pile
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        methode1();
    }

    public static StackTraceElement[] methode1() {
        methode2();
        //écris ton code ici
        return Thread.currentThread().getStackTrace();

    }

    public static StackTraceElement[] methode2() {
        methode3();
        //écris ton code ici
        return Thread.currentThread().getStackTrace();

    }

    public static StackTraceElement[] methode3() {
        methode4();
        //écris ton code ici
        return Thread.currentThread().getStackTrace();

    }

    public static StackTraceElement[] methode4() {
        methode5();
        //écris ton code ici
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] methode5() {
        //écris ton code ici
        return Thread.currentThread().getStackTrace();

    }
}
