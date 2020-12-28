package fr.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/* 
Voyelles et consonnes
*/

public class Solution {
    public static char[] voyelles = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};

    public static void main(String[] args) throws Exception {
        // écris ton code ici
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s  =  bufferedReader.readLine();

        StringBuilder listVoyelles = new StringBuilder();
        StringBuilder restChars =new StringBuilder();

        for (char c :
                s.toCharArray()) {
            if(estVoyelle(c))
                listVoyelles.append(c).append(" ");
            else if(!estVoyelle(c) && !Character.isSpaceChar(c))
                restChars.append(c).append(" ");
        }
        System.out.println(listVoyelles.toString());
        System.out.println(restChars.toString());
    }

    // La méthode vérifie si une lettre est une voyelle
    public static boolean estVoyelle(char c) {
        c = Character.toLowerCase(c);  // Conversion en minuscules

        for (char d : voyelles)   // Recherche les voyelles dans le tableau
        {
            if (c == d)
                return true;
        }
        return false;
    }
}