package fr.codegym.task.task04.task0429;

/* 
Nombres positifs et négatifs
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b  = Integer.parseInt(bufferedReader.readLine());
        int c  = Integer.parseInt(bufferedReader.readLine());
        int np = 0 ;
        int nn = 0 ;

        if( a > 0){
            np++;
        }else if( a < 0){
           nn++;
        }
        if(b > 0){
            np++;
        }else if( b < 0){
            nn++;
        }
        if(c > 0){
            np++;
        }else if( c < 0) {
            nn++;
        }
        System.out.println("Nombre de nombres négatifs : "+nn);
        System.out.println("Nombre de nombres positifs : "+np);


    }
}
