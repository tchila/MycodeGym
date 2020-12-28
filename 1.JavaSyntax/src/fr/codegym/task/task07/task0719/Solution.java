package fr.codegym.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Afficher des nombres en ordre inverse
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> chaines = new ArrayList<Integer>();
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String b = bufferedReader.readLine();
            chaines.add(Integer.parseInt(b));
        }
        for (int i = 0; i < chaines.size(); i++) {
            System.out.println(chaines.get(chaines.size() -1 -i));
        }
    }
}
