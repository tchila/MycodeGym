package fr.codegym.task.task08.task0801;

/* 
HashSet de plantes
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        HashSet<String> set = new HashSet<String>();
        set.add("pastèque");
        set.add("banane");
        set.add("cerise");
        set.add("poire");
        set.add("melon");
        set.add("mûre");
        set.add("ginseng");
        set.add("fraise");
        set.add("iris");
        set.add("pomme de terre");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
