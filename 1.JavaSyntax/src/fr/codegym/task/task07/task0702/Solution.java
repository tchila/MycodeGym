package fr.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Tableau de chaînes en ordre inverse
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        String[] nbre =  new String[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            nbre[i] = bufferedReader.readLine();
        }
        for (int i =  nbre.length- 1; i >=0; i--) {
            System.out.println(nbre[i]);
        }

    }
}