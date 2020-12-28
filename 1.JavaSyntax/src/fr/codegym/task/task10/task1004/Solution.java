package fr.codegym.task.task10.task1004;

/* 
Mission n°4 sur les conversions des types d'entiers
*/

public class Solution {
    public static void main(String[] args) {
        /*
        char x = '9';
int y = x - '0';
         */
        short nombre = 9;
        char zero = '0';
        int neuf = ( zero + nombre);
        System.out.println((char)neuf);
    }
}
