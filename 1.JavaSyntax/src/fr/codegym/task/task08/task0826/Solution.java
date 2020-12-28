package fr.codegym.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/* 
Cinq gagnants
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        int[] tableau = new int[20];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = Integer.parseInt(lecteur.readLine());
        }

        tri(tableau);

        System.out.println(tableau[0]);
        System.out.println(tableau[1]);
        System.out.println(tableau[2]);
        System.out.println(tableau[3]);
        System.out.println(tableau[4]);
    }

    public static void tri(int[] tableau) {
        //écris ton code ici
        Arrays.sort(tableau);
        int middle = tableau.length/2;
        for (int i = 0; i < middle; i++) {
            int tmp = tableau[i];
            tableau[i] = tableau[tableau.length-1-i];
            tableau[tableau.length-1-i] = tmp;
        }
    }
}
