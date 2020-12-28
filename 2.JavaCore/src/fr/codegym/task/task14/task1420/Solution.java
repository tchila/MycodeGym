package fr.codegym.task.task14.task1420;

/* 
PGCD
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception  {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0,j =0;
        String s = bufferedReader.readLine();
        String s1 = bufferedReader.readLine();

       /* if(!s.matches("\\d*") && !s1.matches("\\d*") )
            throw new Exception();*/
        try {
            i = Integer.parseInt(s);
            j = Integer.parseInt(s1);
        } catch (NumberFormatException e) {
            throw new Exception();
        }
        System.out.println(pgcd(i,j));
    }

    static int pgcd(int a, int b){
        if(b == 0)
            return a;
        return pgcd(b, a%b);
    }
}
