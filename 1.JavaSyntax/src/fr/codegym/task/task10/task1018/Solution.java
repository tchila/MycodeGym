package fr.codegym.task.task10.task1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Corrections nécessaires
*/

public class Solution {
    HashMap<Integer, String> map;
    static Integer indice;
    static String nom;

    public Solution() {
        this.map = new HashMap<Integer, String>();
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int indice = Integer.parseInt(lecteur.readLine());
            String nom = lecteur.readLine();
            solution.map.put(indice, nom);
        }

        for (Map.Entry<Integer, String> paire : solution.map.entrySet()) {
            indice = paire.getKey();
            nom = paire.getValue();
            System.out.println("Id=" + indice + " Name=" + nom);
        }
    }
}
