package fr.codegym.task.task08.task0810;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Temps pour 10 000 appels get
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(obtenirTempsObtentionEnMs(remplir(new ArrayList())));
        System.out.println(obtenirTempsObtentionEnMs(remplir(new LinkedList())));
    }

    public static List remplir(List liste) {
        for (int i = 0; i < 10000; i++) {
            liste.add(new Object());
        }
        return liste;
    }

    public static long obtenirTempsObtentionEnMs(List liste) {
        // écris ton code ici
        Date date = new Date();
        obtenir10000(liste);
        Date date1 = new Date();
        return date1.getTime() -date.getTime();
        // écris ton code ici

    }

    public static void obtenir10000(List liste) {
        if (liste.isEmpty()) return;
        int x = liste.size() / 2;

        for (int i = 0; i < 10000; i++) {
            liste.get(x);
        }
    }
}
