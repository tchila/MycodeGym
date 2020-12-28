package fr.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Noms de famille et prénoms partagés
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = creerMapPersonnes();
        imprimerMapPersonnes(map);
    }

    public static Map<String, String> creerMapPersonnes() {
        //écris ton code ici
        HashMap<String,String> map =new HashMap<>();
        map.put("q","b");
        map.put("d","gb");
        map.put("v","n");
        map.put("q","n");
        map.put("g","b");
        map.put("q","x");
        map.put("g","z");
        map.put("t","a");
        map.put("s","q");
        map.put("t","d");

        return map;
    }

    public static void imprimerMapPersonnes(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
