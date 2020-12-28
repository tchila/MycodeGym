package fr.codegym.task.task09.task0911;

import java.util.ArrayList;
import java.util.HashMap;

/* 
Exception lorsque tu travailles avec des collections Map
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici


        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
        //écris ton code ici
    }
}
