package fr.codegym.task.task04.task0427;

/* 
Description de nombres
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int nb = Integer.parseInt(bufferedReader.readLine());
        if(!(nb < 1 || nb >999)){
            System.out.println(checkPair(nb)+nombreChiffre(nb));
        }
    }

    public static String checkPair(int nb){
        if( nb % 2 == 0)
            return "Nombre pair ";
        else
            return "Nombre impair ";
    }

    public static String nombreChiffre(int nb){
        int a = nb % 100;
        if( nb / 100 > 0)
            return "à trois chiffres";
        else if( nb / 10 > 0)
            return "à deux chiffres";
        else
            return "à un chiffre";
    }
}
