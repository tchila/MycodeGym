package fr.codegym.task.task03.task0319;

/* 
Prédictions
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String nom = bufferedReader.readLine();
        String nombre1 = bufferedReader.readLine();
        String nombre2 = bufferedReader.readLine();

        System.out.println(nom + " gagnera " +nombre1 +" dans " +nombre2+ " ans.");
    }
}
