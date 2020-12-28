package fr.codegym.task.task09.task0903;

/* 
Qui m'appelle ?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        methode1();
    }

    public static int methode1() {
        methode2();
        return Thread.currentThread().getStackTrace()[2].getLineNumber() ;

    }

    public static int methode2() {
        methode3();
        return Thread.currentThread().getStackTrace()[2].getLineNumber() ;

    }

    public static int methode3() {
        methode4();
        return Thread.currentThread().getStackTrace()[2].getLineNumber() ;

    }

    public static int methode4() {
        methode5();
        return Thread.currentThread().getStackTrace()[2].getLineNumber() ;
    }

    public static int methode5() {

        return Thread.currentThread().getStackTrace()[2].getLineNumber() ;
    }
}
