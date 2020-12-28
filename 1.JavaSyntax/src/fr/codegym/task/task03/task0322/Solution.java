package fr.codegym.task.task03.task0322;


/* 
Amour pur et profond
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String nom1 = bufferedReader.readLine();
        String nom2 = bufferedReader.readLine();
        String nom3 = bufferedReader.readLine();

        System.out.println(nom1 + " + " + nom2 + " + " + nom3 + " = "+ "Amour pur. Oh là là !");
    }
}