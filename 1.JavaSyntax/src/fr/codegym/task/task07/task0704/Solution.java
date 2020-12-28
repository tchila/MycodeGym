package fr.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Tournez tableau
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        int[] nbre =  new int[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < nbre.length; i++) {
            nbre[i] = Integer.parseInt(bufferedReader.readLine());
        }
        for (int i =  nbre.length- 1; i >=0; i--) {
            System.out.println(nbre[i]);
        }
    }
}

