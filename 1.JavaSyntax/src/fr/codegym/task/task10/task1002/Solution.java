package fr.codegym.task.task10.task1002;

/* 
Mission n°2 sur les conversions des types d'entiers
*/

public class Solution {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c = (float)a / b;
        double d = a * 1e-3 + c;

        System.out.println(d);
    }
}
