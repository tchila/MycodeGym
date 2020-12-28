package fr.codegym.task.task05.task0532;

import java.io.*;

/* 
Mission sur les algorithmes
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(lecteur.readLine());
        if(a> 0){
            int maximum = Integer.MIN_VALUE;

            while(0<a){
                int b = Integer.parseInt(lecteur.readLine());
                if( b > maximum){
                    maximum = b;
                }
                a--;
            }
            //écris ton code ici
            System.out.println(maximum);
        }

    }
}
