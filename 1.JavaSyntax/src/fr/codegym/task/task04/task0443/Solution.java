package fr.codegym.task.task04.task0443;


/* 
Un nom est un nom
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String nom = bufferedReader.readLine();
        int a = Integer.parseInt(bufferedReader.readLine());
        int b  = Integer.parseInt(bufferedReader.readLine());
        int c  = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Je m'appelle "+nom+".");
        System.out.print("Ma date de naissance est le "+c +"/"+b +"/"+a );
    }
}
