package fr.codegym.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Mots identiques dans une liste
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> mots = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            mots.add(lecteur.readLine());
        }

        Map<String, Integer> map = compterMots(mots);

        for (Map.Entry<String, Integer> paire : map.entrySet()) {
            System.out.println(paire.getKey() + " " + paire.getValue());
        }
    }

    public static Map<String, Integer> compterMots(ArrayList<String> liste) {
        HashMap<String, Integer> resultat = new HashMap<String, Integer>();

        //écris ton code ici

        for (int i = 0; i < liste.size()-1; i++) {
            int k = 1;
            if((resultat.get(liste.get(i)) == null)){
                for (int j = i+1; j < liste.size(); j++) {
                    if(  (liste.get(i).equals(liste.get(j))))
                        k++;
                }
                resultat.put(liste.get(i),k);
            }

        }


        return resultat;
    }

}

