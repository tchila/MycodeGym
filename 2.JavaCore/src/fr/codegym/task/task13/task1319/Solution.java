package fr.codegym.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Écriture dans un fichier à partir de la console
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // écris ton code ici
        ArrayList<String> lines = new ArrayList<>();
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String file = bufferedReader.readLine();
            bufferedWriter = new BufferedWriter(new FileWriter(file));

            while (true){
                String line = bufferedReader.readLine();
                lines.add(line);
                if(line.equals("quitter")) break;
            }

            for (String s : lines) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }



        }catch (IOException e){
            e.printStackTrace();
        }finally {
            bufferedWriter.close();
            bufferedReader.close();

        }

    }
}
