package fr.codegym.task.task04.task0425;

/* 
Cible verrouillée !
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b  = Integer.parseInt(bufferedReader.readLine());
        if(a > 0 && b >0){
            System.out.println(1);
        }else if(a < 0 && b >0){
            System.out.println(2);
        }else if(a < 0 && b <0){
            System.out.println(3);
        }else if(a > 0 && b <0){
            System.out.println(4);
        }

        //écris ton code ici
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

    }
}
