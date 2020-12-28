package fr.codegym.task.task08.task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Temps pour 10 000 insertions
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(obtenirTempsInsertionEnMs(new ArrayList()));
        System.out.println(obtenirTempsInsertionEnMs(new LinkedList()));
    }

    public static long obtenirTempsInsertionEnMs(List liste) {
        // écris ton code ici
        Date date = new Date();

        inserer10000(liste);

        // écris ton code ici
        Date date1 = new Date();
        return date1.getTime() -date.getTime();

    }

    public static void inserer10000(List liste) {
        for (int i = 0; i < 10000; i++) {
            liste.add(0, new Object());
        }
    }
}
