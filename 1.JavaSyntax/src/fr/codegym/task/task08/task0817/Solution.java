package fr.codegym.task.task08.task0817;

import java.util.*;

/* 
Nous n'avons pas besoin de répétitions
*/

public class Solution {
    public static HashMap<String, String> creerMap() {
        //écris ton code ici
        //écris ton code ici
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("q","1");
        hashMap.put("s","2");
        hashMap.put("d","4");
        hashMap.put("f","3");
        hashMap.put("g","1");
        hashMap.put("h","0");
        hashMap.put("j","1");
        hashMap.put("k","1");
        hashMap.put("l","0");
        hashMap.put("m;","1");
        return hashMap;

    }

    public static void supprimerPrenomsIdentiques(Map<String, String> map) {
        //écris ton code ici
        //écris ton code ici
        HashMap<String, String> copie = new HashMap<String, String>(map);

        Collection<String> liste = copie.values();

            for (String s: liste) {
                int i = 0;
                for (String ss: liste) {
                if(s==ss)
                    i++;
                if(i>1){
                    supprimerElementMapParValeur(map,ss);
                    break;
                }
            }}




    }

    public static void supprimerElementMapParValeur(Map<String, String> map, String valeur) {
        HashMap<String, String> copie = new HashMap<String, String>(map);
        for (Map.Entry<String, String> paire : copie.entrySet()) {
            if (paire.getValue().equals(valeur))
                map.remove(paire.getKey());
        }
    }

    public static void main(String[] args) {
    }
}
