package fr.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Duplication de mots
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Read strings from the console and declare an ArrayList here
        ArrayList<String> chaines = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String b = bufferedReader.readLine();
            chaines.add(b);
        }
        ArrayList<String> resultat = dupliquerValeurs(chaines);

        // Display result
        chaines.forEach(System.out::println);
    }

    public static ArrayList<String> dupliquerValeurs(ArrayList<String> liste) {
        //écris ton code ici
        for (int i = 0; i < liste.size(); ) {
            liste.add(i+1,liste.get(i));
            i+=2;
        }
        return liste;
    }
}
