package fr.codegym.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        int b = Integer.parseInt(bufferedReader.readLine());

        if(b < 18){
            System.out.println("Grandis encore un peu");
        }
    }
}
