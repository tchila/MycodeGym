package fr.codegym.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Mission sur les algorithmes
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        int[] tableau = new int[30];
        for (int i = 0; i < 30; i++) {
            tableau[i] = Integer.parseInt(lecteur.readLine());
        }

        tri(tableau);

        System.out.println(tableau[9]);
        System.out.println(tableau[10]);
    }

    public static void tri(int[] tableau) {
        //écris ton code ici
        Arrays.sort(tableau);
    }
}
