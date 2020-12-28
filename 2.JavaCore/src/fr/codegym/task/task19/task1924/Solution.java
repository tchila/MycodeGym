package fr.codegym.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Remplacement de nombres
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
            static {
                map.put(0,"zéro");
                map.put(1,"un");
                map.put(2,"deux");
                map.put(3,"trois");
                map.put(4,"quatre");
                map.put(5,"cinq");
                map.put(6,"six");
                map.put(7,"sept");
                map.put(8,"huit");
                map.put(9,"neuf");
                map.put(10,"dix");
                map.put(11,"onze");
                map.put(12,"douze");
            }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();
        bufferedReader.close();

        StringBuilder stringBuilder = new StringBuilder();
        FileReader reader = new FileReader(file);

        while (reader.ready()){
            stringBuilder.append(((char)reader.read()));
        }
        String[] strings = stringBuilder.toString().split(" ");

        for (int i = 0; i < strings.length; i++) {
            if((strings[i].matches("-?\\d+")) && (map.get(Integer.parseInt(strings[i]))!=null))
                strings[i] = map.get(Integer.parseInt(strings[i]));
        }

        /*for (int i = 0; i < contenu.length(); i++) {
            if(!Character.isDigit(contenu.charAt(i)))
                i++;
            else{
                int j = i;
                while (j < contenu.length() && Character.isDigit(contenu.charAt(j))) j++;
                System.out.println(contenu.substring(i, j));
                contenu.replace(contenu.substring(i, j),map.get(Integer.parseInt(contenu.substring(i, j))));
                i=i + map.get(Integer.parseInt(contenu.substring(i, j))).length();
            }
        }*/
        System.out.println(String.join(" " ,strings));


        reader.close();

    }
}
