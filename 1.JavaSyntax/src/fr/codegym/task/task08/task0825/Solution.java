package fr.codegym.task.task08.task0825;

/* 
Modificateur mal placé
*/

public class Solution {
    public static int A = 5;
    public static int B = 2;

    public int C = A * B;
    public static int D = B * A;

    public static void main(String[] args) {
    }

    public  int obtenirValeur() {
        return D;
    }

    public int obtenirValeur2() {
        return C;
    }
}

