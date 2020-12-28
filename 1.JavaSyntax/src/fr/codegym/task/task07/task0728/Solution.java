package fr.codegym.task.task07.task0728;

import sun.awt.AWTAccessor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Queue;

/* 
Par ordre décroissant
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        int[] tableau = new int[20];
        for (int i = 0; i < 20; i++) {
            tableau[i] = Integer.parseInt(lecteur.readLine());
        }

        tri(tableau);

        for (int x : tableau) {
            System.out.println(x);
        }
    }

    public static void tri(int[] tableau) {
        //écris ton code ici
        Arrays.sort(tableau);
        int[] tableaux = new int[20];

        for (int i = 0; i < tableaux.length; i++) {
            tableaux[i] =tableau[tableau.length-1-i] ;
            }
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] =tableaux[i] ;
            }

    }
}
