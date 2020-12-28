package fr.codegym.task.task04.task0418;

/* 
Le plus petit de deux nombres
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        if(Integer.parseInt(a )< Integer.parseInt(b ))
            System.out.println(a);
        else if(a == b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}