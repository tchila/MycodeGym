package fr.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Exprimons-nous de façon plus concise
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //écris ton code ici
        ArrayList<String> chaines = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        chaines.add(a);
        int min = a.length();
        for (int i = 0; i < 4 ; i++) {
            String b = bufferedReader.readLine();
            chaines.add(b);
            if(b.length()<min)
                min=b.length();
        }
        for (String s :
                chaines) {
            if(s.length() == min)
                System.out.println(s);
        }
    }
}
