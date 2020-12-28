package fr.codegym.task.task04.task0420;

/* 
Tri de trois nombres
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if(a >= b ){
            if(b >= c){
                System.out.println(" "+a +" "+b + " "+c );
            }else if (c >=a){
                System.out.println(" "+c +" "+a + " "+b );
            }else if (a >=c){
                System.out.println(" "+a +" "+c + " "+b );
            }
        }else if(b >= a){
            if(a >=c){
                System.out.println(" "+b +" "+a + " "+c );
            }else if (c >=b){
                System.out.println(" "+c +" "+b + " "+a );
            }else if (b >=c){
                System.out.println(" "+b +" "+c + " "+a );
            }
        }


    }


}
