package fr.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R ou L
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> liste = new ArrayList<String>();
        liste.add("rose"); // 0
        liste.add("love"); // 1
        liste.add("lyre"); // 2
        liste = corriger(liste);

        for (String s : liste) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> corriger(ArrayList<String> liste) {
        // écris ton code ici
        for (int i = 0; i < liste.size(); ) {
            if(liste.get(i).contains("l") && !liste.get(i).contains("r")){
                liste.add(i+1,liste.get(i));
                i+=2;
            }else if (!liste.get(i).contains("l") && liste.get(i).contains("r"))
            {
                liste.remove(liste.get(i));
            }
            else
                i++;
        }
        return liste;
    }
}