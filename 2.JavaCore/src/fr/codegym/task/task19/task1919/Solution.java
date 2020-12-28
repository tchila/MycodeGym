package fr.codegym.task.task19.task1919;

/* 
Calcul des salaires
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new HashMap<>();
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s = "";
        while ((s = bufferedReader.readLine()) != null){
            String key = s.split(" ")[0];
            Double value = Double.parseDouble(s.split(" ")[1]) ;

            map.merge(key, value, Double::sum);

            map.merge(key,value, Double::sum);
            if(map.get(key) == null)
                map.put(key,value);
            else
                map.put(key,map.get(key)+value);
        }

        TreeSet<String> keySorted = new TreeSet<>(map.keySet());
        for (String s1 : keySorted) {
            System.out.println(s1 + " "+map.get(s1));
        }
        bufferedReader.close();

    }
}
