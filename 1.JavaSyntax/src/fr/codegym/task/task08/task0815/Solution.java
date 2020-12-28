package fr.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Recensement
*/

public class Solution {
    public static HashMap<String, String> creerMap() {
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

    public static int obtenirNombrePrenomsIdentiques(HashMap<String, String> map, String nom) {
        //écris ton code ici
       return  (int) map.values().stream().filter(s -> s.equals(nom)).count();
        /*for (Map.Entry<String, String> s:
             map.entrySet()) {
            if (s.getValue().equals(map.get(nom)))
                    count++;
        }*/

    }

    public static int obtenirNombreNomsIdentiques(HashMap<String, String> map, String nom) {
        //écris ton code ici
       return (int) map.keySet().stream().filter(s -> s.equals(nom)).count();


    }

    public static void main(String[] args) {

    }
}
