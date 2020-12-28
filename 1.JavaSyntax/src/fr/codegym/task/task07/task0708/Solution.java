package fr.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
La chaîne la plus longue
*/

public class Solution {
    private static List<String> chaines;


    public static void main(String[] args) throws Exception {
        //écris ton code ici
        chaines = new ArrayList<String>();
        int max = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5 ; i++) {
            String a = bufferedReader.readLine();
            chaines.add(a);
            if(a.length()>max)
                max=a.length();
        }
        for (String s :
                chaines) {
            if(s.length() == max)
                System.out.println(s);
        }

    }
}
