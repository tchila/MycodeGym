package fr.codegym.task.task10.task1017;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Récupération sécurisée à partir d'une liste
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> liste = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(lecteur.readLine());
            liste.add(x);
        }

        System.out.println(obtentionSureElement(liste, 5, 1));
        System.out.println(obtentionSureElement(liste, 20, 7));
        System.out.println(obtentionSureElement(liste, -5, 9));
    }

    public static int obtentionSureElement(ArrayList<Integer> liste, int indice, int valeurDefaut) {
        //écris ton code ici

        try {
            return liste.get(indice);
        } catch (Exception e) {
            return valeurDefaut;
        }
    }

}
