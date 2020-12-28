package fr.codegym.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Lecture d'un fichier
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // écris ton code ici
        BufferedReader bufferedReader = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String file = bufferedReader.readLine();

            byte[] buffer = new byte[2048];
            int current = 0;
            String strFileContents = "";
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            while ((current = bufferedInputStream.read(buffer)) !=-1){
                //String s = (String) bufferedInputStream.read(buffer,0,current);
                strFileContents += new String(buffer, 0, current);
            }
            System.out.println(strFileContents);

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            bufferedInputStream.close();
            bufferedReader.close();

        }



    }
}