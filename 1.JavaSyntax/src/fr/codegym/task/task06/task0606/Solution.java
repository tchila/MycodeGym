package fr.codegym.task.task06.task0606;

import java.io.*;

/* 
Chiffres pairs et impairs
*/

public class Solution {

    public static int pair;
    public static int impair;

    public static void main(String[] args) throws IOException {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String saisie = bufferedReader.readLine();
        int taille = saisie.length();
        int nb = Integer.parseInt(saisie);

        for (int i = taille -1; i >= 0 ; i--) {
            int a = (int) ((int) nb / Math.pow(10,i));
            nb%=Math.pow(10,i);
            if(a%2==0){
                pair++;
            }else {
                impair++;
            }
        }
        System.out.println("Pair : "+ pair +" Impair : " + impair);
    }
}
