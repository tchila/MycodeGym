package fr.codegym.task.task12.task1230;

/* 
Entrée dans le top dix
*/

public class Solution {
    public static void main(String[] args) {
        Integer i = 5;
        int x = transformValue(i);

        System.out.println(x);
    }
    public static int transformValue(Integer i) {
        return i * 2;
    }

    public static int transformValue(int i) {
        return i * i;
    }
}
