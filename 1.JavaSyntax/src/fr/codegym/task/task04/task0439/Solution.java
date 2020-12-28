package fr.codegym.task.task04.task0439;

/* 
Chaîne de lettres
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String nom = bufferedReader.readLine();

        for (int j =1 ; j <= 10 ; j++) {

            System.out.println(nom + " m'aime.");
        }

    }
}
