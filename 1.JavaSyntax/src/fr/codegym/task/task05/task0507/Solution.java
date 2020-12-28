package fr.codegym.task.task05.task0507;

/* 
Moyenne arithmétique
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double somme = 0;
        int nb = 0;
        while (true) {
            double nombre = Double.parseDouble(bufferedReader.readLine());
            if (nombre == -1 ){
                if(nb >0)
                    System.out.println(somme/nb);
                break;
            }
            somme += nombre;
            nb++;
        }
    }
}

