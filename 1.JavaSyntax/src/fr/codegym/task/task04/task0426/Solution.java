package fr.codegym.task.task04.task0426;

/* 
Étiquettes et nombres
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        if(a > 0 && (a % 2 == 0)){
            System.out.println("Nombre pair positif");
        }else if(a > 0 && (a % 2 != 0)){
            System.out.println("Nombre impair positif");
        }else if(a < 0 && (a % 2 == 0)){
            System.out.println("Nombre pair négatif");
        }else if(a < 0 && (a % 2 != 0)){
            System.out.println("Nombre impair négatif");
        }else{
            System.out.println("Zéro");
        }
    }
}
