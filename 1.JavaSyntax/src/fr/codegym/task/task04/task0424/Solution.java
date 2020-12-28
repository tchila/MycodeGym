package fr.codegym.task.task04.task0424;

/* 
Trois nombres
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b  = Integer.parseInt(bufferedReader.readLine());
        int c  = Integer.parseInt(bufferedReader.readLine());

        if((a !=  b) && (b == c))
            System.out.println("1");
        else if((c !=  b) && (c == a))
            System.out.println("2");
        else if((a !=  c) && (b == a))
            System.out.println("3");

    }


}
