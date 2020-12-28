package fr.codegym.task.task19.task1909;

/* 
Modification des signes de ponctuation
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fichier1 = bufferedReader.readLine();
        String fichier2  = bufferedReader.readLine();
        bufferedReader.close();
        BufferedReader reader = new BufferedReader(new FileReader(fichier1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fichier2));
        String line = "";
        while ((line =reader.readLine()) != null){
            writer.write(line.replace(".","!"));
        }
        reader.close();
        writer.close();

    }
}
