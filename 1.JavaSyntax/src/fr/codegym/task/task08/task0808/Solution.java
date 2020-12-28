package fr.codegym.task.task08.task0808;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* 
Dix mille suppressions et insertions
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        inserer10000(arrayList);
        obtenir10000(arrayList);
        definir10000(arrayList);
        supprimer10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        inserer10000(linkedList);
        obtenir10000(linkedList);
        definir10000(linkedList);
        supprimer10000(linkedList);
    }

    public static void inserer10000(List liste) {
        //écris ton code ici
        for (int i = 0; i < 10000; i++) {
            liste.add(i);
        }

    }

    public static void obtenir10000(List liste) {
        //écris ton code ici
        for (int i = 0; i < 10000; i++) {
            Object k = liste.get(i);
        }

    }

    public static void definir10000(List liste) {
        //écris ton code ici
        for (int i = 0; i < 10000; i++) {
            liste.set(i,i);
        }


    }

    public static void supprimer10000(List liste) {
        //écris ton code ici
        for (int i = 0; i < 10000;i++ ) {
            liste.remove(liste.get(0));
        }

    }
}
