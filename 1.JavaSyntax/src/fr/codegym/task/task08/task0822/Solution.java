package fr.codegym.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* 
Le plus petit de N nombres
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> listeEntiers = obtenirListeEntiers();
        System.out.println(obtenirMinimum(listeEntiers));
    }

    public static int obtenirMinimum(List<Integer> tableau) {
        // Trouve le minimum ici
        Collections.sort(tableau);
        return tableau.get(0);
    }

    public static List<Integer> obtenirListeEntiers() throws IOException {
        // Crée et initialise une liste ici
        List<Integer> list =new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer i = Integer.parseInt(bufferedReader.readLine());
        for (int j = 0; j < i; j++) {
            Integer k = Integer.parseInt(bufferedReader.readLine());
            list.add(k);
        }
        return list;
    }
}
