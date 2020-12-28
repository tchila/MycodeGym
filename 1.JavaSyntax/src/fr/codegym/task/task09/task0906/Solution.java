package fr.codegym.task.task09.task0906;

/* 
Enregistrement des traces de pile
*/

public class Solution {
    public static void main(String[] args) {
        journaliser("Dans la méthode main");
    }

    public static void journaliser(String s) {
        //écris ton code ici
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
        System.out.println(stackTraceElement.getClassName() + ": "+ stackTraceElement.getMethodName()+ ": "+s);
    }
}
