package fr.codegym.task.task04.task0428;

/* 
Nombre positif
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b  = Integer.parseInt(bufferedReader.readLine());
        int c  = Integer.parseInt(bufferedReader.readLine());
         int i = 0 ;
        if( a > 0){
            i++;
        }
        if(b > 0){
            i++;
        }
        if(c > 0){
            i++;
        }
        System.out.println(i);

    }
}
