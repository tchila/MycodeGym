package fr.codegym.task.task04.task0436;


/* 
Dessin d'un rectangle
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b  = Integer.parseInt(bufferedReader.readLine());

        for (int i =1 ; i <= a ; i++) {
            for (int j =1 ; j <= b ; j++) {
                if(j<b)
                    System.out.print(8);
                else
                    System.out.println(8);
            }
        }

    }
}
