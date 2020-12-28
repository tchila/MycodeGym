package fr.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Suppression et insertion
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        ArrayList<String> chaines = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5 ; i++) {
            String b = bufferedReader.readLine();
            chaines.add(b);
        }
        for (int i = 0; i < 13 ; i++) {
            String c = chaines.remove(chaines.size()-1);
            chaines.add(0, c);
        }

        for (String chaine : chaines) {
            System.out.println(chaine);
        }
    }
}
