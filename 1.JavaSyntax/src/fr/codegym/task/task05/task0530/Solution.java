package fr.codegym.task.task05.task0530;

import java.io.*;

/* 
Patron, il se passe quelque chose de bizarre
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(lecteur.readLine());
        int b = Integer.parseInt(lecteur.readLine());

        int somme = a + b;
        System.out.println("Somme = " + somme);
    }
}
