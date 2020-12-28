package fr.codegym.task.task03.task0318;

/* 
Plan de conquête du monde
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String nombre = bufferedReader.readLine();
        String nom = bufferedReader.readLine();
        int nb = Integer.parseInt(nombre);

        System.out.println(nom + " conquerra le monde dans  "+nb +" ans. Moua-ha-ha !");
    }
}
