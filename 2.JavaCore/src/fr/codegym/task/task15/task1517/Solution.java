package fr.codegym.task.task15.task1517;

/* 
Modificateurs statiques et exceptions
*/

public class Solution {
    public static int A = 0;

    static  {
        // Lever une exception ici
        int c = 5/A;

    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}

