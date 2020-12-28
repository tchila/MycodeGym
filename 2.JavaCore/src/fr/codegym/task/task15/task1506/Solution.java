package fr.codegym.task.task15.task1506;

/* 
Quelque chose de superflu
*/

public class Solution {
    public static void main(String[] args) {
        print((short) 1);
        print((Number) 1);
        print(1);
        print((Integer) 1);
        print((int) 1);
    }

    public static void print(Integer i) {
        System.out.println("C'est un Integer");
    }




    public static void print(Object i) {
        System.out.println("C'est un Object");
    }

    public static void print(double i) {
        System.out.println("C'est un double");
    }


}
