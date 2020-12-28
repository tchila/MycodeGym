package fr.codegym.task.task07.task0707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Qu'est-ce que c'est que cette liste ?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        ArrayList<String> liste =  new ArrayList<>();
        liste.add("a");
        liste.add("b");
        liste.add("c");
        liste.add("d");
        liste.add("e");

        System.out.println(liste.size());
        for (String s : liste) {
            System.out.println(s);
        }
    }
}
