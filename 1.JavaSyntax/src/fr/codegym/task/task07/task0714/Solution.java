package fr.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Mots inversés
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        ArrayList<String> chaines = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String b = bufferedReader.readLine();
            chaines.add(b);
        }
        chaines.remove(2);
        for (int i = 0; i < chaines.size(); i++) {
            System.out.println(chaines.get(chaines.size() - 1 - i));
        }
    }
}


