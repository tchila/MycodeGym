package fr.codegym.task.task19.task1925;

/* 
Long words
*/

import java.io.*;
import java.util.StringJoiner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        FileWriter writer = new FileWriter(args[1]);
        String line = "";
        String contenu = "";
        StringJoiner joiner = new StringJoiner(",");
        while ((line = reader.readLine()) != null){
            String[] t = line.split(" ");
            for (String s1 : t) {
                if(s1.length()> 6)
                    joiner.add(s1);
            }
        }
        writer.write(joiner.toString());
        reader.close();
        writer.close();

    }
}
