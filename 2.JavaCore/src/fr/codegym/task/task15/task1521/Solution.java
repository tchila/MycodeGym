package fr.codegym.task.task15.task1521;

import java.math.BigDecimal;

/* 
POO : Surcharge de méthodes
*/

public class Solution {
    public static void main(String[] args) {
        // Bloc 2.
        // Appel pour les objets
        new Tree().info((Object)new Integer("4"));
        new Tree().info((Object)new Short("4"));
        new Tree().info((Object)new BigDecimal("4"));

        // Bloc 3.
        // Appel pour les nombres
        new Tree().info(new Integer("4"));
        new Tree().info(new Short("4"));
        new Tree().info(new BigDecimal("4"));

        // Bloc 4.
        // Appel pour les chaînes
        new Tree().info(new String("4"));
        new Tree().info(new Integer("4").toString());
        new Tree().info(new Short("4").toString());
        new Tree().info(new BigDecimal("4").toString());
    }
}
