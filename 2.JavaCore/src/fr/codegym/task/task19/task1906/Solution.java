package fr.codegym.task.task19.task1906;

/* 
Caractères pairs
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fichier1 = bufferedReader.readLine();
        String fichier2 = bufferedReader.readLine();
        bufferedReader.close();
        FileReader fileReader = new FileReader(fichier1);
        FileWriter fileWriter = new FileWriter(fichier2);
        int c= 0;
        String s = "";
        int ordinal = 1;
        while ((c = fileReader.read()) != -1){
            if(ordinal%2 == 0)
                fileWriter.write(c);
            ordinal++;
        }

        fileReader.close();
        fileWriter.close();

    }
}
