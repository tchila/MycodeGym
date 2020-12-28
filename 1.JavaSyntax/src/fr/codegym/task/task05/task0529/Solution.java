package fr.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Cochon tirelire dans la console
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int somme = 0;
        while(true){
            String nombre = bufferedReader.readLine();
            if(nombre.equals("somme")){
                System.out.println(somme);
                break;
            }
            somme+= Integer.parseInt(nombre);
        }
    }
}
