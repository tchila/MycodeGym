package fr.codegym.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Rechercher les bonnes lignes
*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("fichier");
        words.add("voir");
        words.add("Dans");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s  =  bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader reader = new BufferedReader(new FileReader(s));
        String line = "";
        while ((line = reader.readLine()) != null){
            String[] t = line.split(" ");
            int count = (int) Arrays.stream(t).filter(s1 -> words.contains(s1)).count();
            //Arrays.stream(t).filter(s -> words.contains(s)).count()
            if(count == 2)
                System.out.println(line);
        }
        reader.close();
    }
}
