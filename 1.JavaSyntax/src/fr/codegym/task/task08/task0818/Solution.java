package fr.codegym.task.task08.task0818;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Réservé aux riches
*/

public class Solution {
    public static HashMap<String, Integer> creerMap() {
        //écris ton code ici
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("q",655);
        hashMap.put("s",44);
        hashMap.put("d",988765);
        hashMap.put("f",9789);
        hashMap.put("g",965545);
        hashMap.put("h",55);
        hashMap.put("j",96445);
        hashMap.put("k",65);
        hashMap.put("l",145);
        hashMap.put("m;",452);
        return hashMap;
    }

    public static void supprimerElementMap(HashMap<String, Integer> map) {
        //écris ton code ici
        map.entrySet().removeIf(s -> (s.getValue() < 500));
    }

    public static void main(String[] args) {

    }
}