package fr.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Minimum et maximum dans les tableaux
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        int[] chaines = new int[20];
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            String b = bufferedReader.readLine();
            chaines[i] = Integer.parseInt(b);
        }
        int maximum = chaines[0];
        int minimum = chaines[0];

        //écris ton code ici
        for (int i = 1; i < chaines.length; i++) {
            if(maximum < chaines[i])
                maximum = chaines[i];
            if(minimum > chaines[i])
                minimum = chaines[i];
        }
        System.out.print(maximum + " " + minimum);
    }
}
