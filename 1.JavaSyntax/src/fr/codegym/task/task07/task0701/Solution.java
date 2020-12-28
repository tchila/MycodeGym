package fr.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Maximum dans un tableau
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] tableau = initialiserTableau();
        int max = max(tableau);
        System.out.println(max);
    }

    public static int[] initialiserTableau() throws IOException {
        // Create and populate the array
        int[] nbre =  new int[20];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < nbre.length; i++) {
            nbre[i] = Integer.parseInt(bufferedReader.readLine());
        }

        return nbre;
    }

    public static int max(int[] tableau) {
        // Find the maximum
        int max =tableau[0];
        for (int value : tableau) {
            if (value > max) {
                max = value;
            }
        }


        return max;
    }
}
