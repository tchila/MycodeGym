package fr.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Interactions entre tableaux isolés
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        String[] chaines =  new String[10];
        int[] nbre =  new int[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < chaines.length; i++) {
            chaines[i] = bufferedReader.readLine();
        }

        for (int i = 0; i < nbre.length; i++) {
            nbre[i] = chaines[i].length();
            System.out.println(nbre[i]);
        }


    }
}
