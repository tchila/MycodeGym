package fr.codegym.task.task09.task0926;

import java.util.ArrayList;

/* 
Liste de tableaux de nombres
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> liste = creerListe();
        imprimerListe(liste);

    }

    public static ArrayList<int[]> creerListe() {
        //écris ton code ici
        ArrayList<int[]> liste = new ArrayList<>();
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{6,7};
        int[] c = new int[]{8,9,10,11};
        int[] d = new int[]{12,13,14,15,16,17,18};
        int[] e = new int[]{};
        liste.add(a);
        liste.add(b);
        liste.add(c);
        liste.add(d);
        liste.add(e);
        return liste;
    }

    public static void imprimerListe(ArrayList<int[]> liste) {
        for (int[] tableau : liste) {
            for (int x : tableau) {
                System.out.println(x);
            }
        }
    }
}
