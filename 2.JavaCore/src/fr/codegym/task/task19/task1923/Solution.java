package fr.codegym.task.task19.task1923;

/* 
Des mots avec des chiffres
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        FileWriter writer = new FileWriter(args[1]);
        String line = "";
        String contenu = "";
        while ((line = reader.readLine()) != null){
            String[] t = line.split(" ");
            for (String s1 : t) {
                if(s1.matches("\\S*\\d+\\S*"))
                   contenu+=s1+ " ";
            }
        }
        writer.write(contenu);
        reader.close();
        writer.close();
    }
}
