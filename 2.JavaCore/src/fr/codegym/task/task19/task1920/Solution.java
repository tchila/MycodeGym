package fr.codegym.task.task19.task1920;

/* 
Le plus riche
*/

import javafx.print.Collation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.Collator;
import java.util.*;

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
        }

        double max = map.values().stream().mapToDouble(value -> value).filter(value -> value >= 0).max().orElse(0);
        List<String> keySorted = new ArrayList<>(map.keySet());
        //TreeSet<String> keySorted = new TreeSet<>(map.keySet(), Collator.getInstance());
        keySorted.sort(Collator.getInstance());
        for (String s1 :keySorted)  {
            if(map.get(s1) == max)
                System.out.println(s1);
        }
        bufferedReader.close();
    }
}
