package fr.codegym.task.task04.task0442;


/* 
Ajout
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int somme = 0;
        while (true) {
            int nombre = Integer.parseInt(bufferedReader.readLine());
            somme += nombre;
            if (nombre == -1){
                System.out.println(somme);
                break;
            }



        }
    }
}
