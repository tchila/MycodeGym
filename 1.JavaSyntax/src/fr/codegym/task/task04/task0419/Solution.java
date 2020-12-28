package fr.codegym.task.task04.task0419;

/* 
Le plus grand de quatre nombres
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        String c = bufferedReader.readLine();
        String d = bufferedReader.readLine();

        System.out.println(plusGrand(plusGrand(a, b), plusGrand(c, d)));

    }

    public static String plusGrand(String a, String b){

        if(Integer.parseInt(a )> Integer.parseInt(b ))
            return a;
        else if(a == b)
            return a;
        else
            return b;

    }
}
