package fr.codegym.task.task09.task0904;

/* 
Trace de pile avec 10 appels
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int longueurTracePile = methode1().length - methode10().length + 1;
    }

    public static StackTraceElement[] methode1() {
        return methode2();
    }

    public static StackTraceElement[] methode2() {
        //écris ton code ici
        return methode3();
    }

    public static StackTraceElement[] methode3() {
        //écris ton code ici
        return methode4();
    }

    public static StackTraceElement[] methode4() {
        //écris ton code ici
        return methode5();
    }

    public static StackTraceElement[] methode5() {
        //écris ton code ici
        return methode6();
    }

    public static StackTraceElement[] methode6() {
        //écris ton code ici
        return methode7();
    }

    public static StackTraceElement[] methode7() {
        //écris ton code ici
        return methode8();
    }

    public static StackTraceElement[] methode8() {
        //écris ton code ici
        return methode9();
    }

    public static StackTraceElement[] methode9() {
        return methode10();
    }

    public static StackTraceElement[] methode10() {
        return Thread.currentThread().getStackTrace();
    }
}
