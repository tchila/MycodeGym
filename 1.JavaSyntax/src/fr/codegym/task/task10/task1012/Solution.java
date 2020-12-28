package fr.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Nombre de lettres
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] tableauAbc = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char lettre : tableauAbc) {
            alphabet.add(lettre);
        }

        // Lire dans des chaînes
        ArrayList<String> liste = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = lecteur.readLine();
            liste.add(s.toLowerCase());
        }

        Map<Character,Integer> map = new HashMap<>();
        for (Character value : alphabet) {
            int k = 0;
            for (String s : liste) {
                for (char c : s.toCharArray()) {
                    if (value.equals(c))
                        k++;
                }
            }
            map.put(value, k);
        }

        for (Character character : alphabet) {
            if (map.get(character) != null)
                System.out.println(character + " " + map.get(character));
            else
                System.out.println(character + " " + 0);
        }
        // écris ton code ici
    }

}
