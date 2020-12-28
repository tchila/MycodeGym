package fr.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Plus de 10 ? Ça ne va pas marcher.
*/

public class Solution {
    public static HashSet<Integer> creerSet() {
        // écris ton code ici
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);

        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(115);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(11119);
        set.add(20);
        return set;

    }

    public static HashSet<Integer> supprimerNombresSuperieursA10(HashSet<Integer> ensemble) {
        // écris ton code ici

        ensemble.removeIf(i -> i > 10);

          return ensemble;

    }

    public static void main(String[] args) {

    }
}
