package fr.codegym.task.task10.task1015;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Tableau de listes de chaînes
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] tableauDeListesChaines = creerListe();
        imprimerListe(tableauDeListesChaines);
    }

    public static ArrayList<String>[] creerListe() {
        //écris ton code ici
        ArrayList<String>[] arrayLists = new ArrayList[1];
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
         arrayLists[0] = list;
        return arrayLists;
    }

    public static void imprimerListe(ArrayList<String>[] tableauDeListesChaines) {
        for (ArrayList<String> liste : tableauDeListesChaines) {
            for (String s : liste) {
                System.out.println(s);
            }
        }
    }
}