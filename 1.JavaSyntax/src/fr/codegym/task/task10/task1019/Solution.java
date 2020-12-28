package fr.codegym.task.task10.task1019;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
La fonctionnalité ne suffit pas !
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, List<String>> map = new HashMap<Integer, List<String>>  ();
        while (true) {
            String s = lecteur.readLine();
            if (s.isEmpty()) break;
            int indice = Integer.parseInt(s);
            String nom = lecteur.readLine();
            if(map.get(indice)!=null)
                map.get(indice).add(nom);
            else {
                List<String> list = new ArrayList<>();
                list.add(nom);
                map.put(indice, list);
            }
            if (nom.isEmpty()){
                break;
            }

        }
        for (Map.Entry<Integer, List<String>> paire : map.entrySet()) {
           // if(paire.getValue() == null)
           //     System.out.println( paire.getKey() );
           // else {
                for (String s : paire.getValue()) {
                    System.out.println(paire.getKey() + " " + s);
                }
           // }

        }


    }
}
