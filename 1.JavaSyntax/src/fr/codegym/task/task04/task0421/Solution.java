package fr.codegym.task.task04.task0421;

/* 
Jen ou Jen ?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        if(a.equals(b)){
            System.out.println("Les noms sont identiques");
        }else if(a.length() == b.length()){
            System.out.println("Les noms sont de la même longueur");
        }
    }
}
