package fr.codegym.task.task10.task1001;

/* 
Mission n°1 sur les conversions des types d'entiers
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b =  a + 46;
        byte c = (byte) (a * b);
        double f =  1234.15;
        long d = (long) (a + f / c + b);
        System.out.println(d);
    }
}
