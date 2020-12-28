package fr.codegym.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Direction le sommet de la liste
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        ArrayList<String> chaines = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10 ; i++) {
            String b = bufferedReader.readLine();
            chaines.add(0,b);
        }
        for (int i = 0; i < 10 ; i++) {
            System.out.println(chaines.get(i));
        }
    }
}
