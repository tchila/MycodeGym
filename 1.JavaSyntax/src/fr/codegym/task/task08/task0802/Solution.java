package fr.codegym.task.task08.task0802;

/* 
HashMap de 10 paires
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("pastèque","melon");
        map.put("banane","fruit");
        map.put("cerise","fruit");
        map.put("poire","fruit");
        map.put("melon","melon");
        map.put("mûre","fruit");
        map.put("ginseng","racine");
        map.put("fraise","fruit");
        map.put("iris","fleur");
        map.put("pomme de terre","tubercule");

        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,String> paire = iterator.next();
            System.out.println(paire.getKey() + " - " + paire.getValue());
        }

    }
}
