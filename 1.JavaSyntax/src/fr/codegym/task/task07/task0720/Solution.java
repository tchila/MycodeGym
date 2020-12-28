package fr.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Mélange en temps opportun
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        //écris ton code ici
        ArrayList<String> chaines = new ArrayList<String>();
        Integer n = Integer.parseInt(lecteur.readLine());
        Integer m = Integer.parseInt(lecteur.readLine());
        //écris ton code ici
        for (int i = 0; i < n; i++) {
            String b = lecteur.readLine();
            chaines.add(b);
        }
        for (int k = 0; k < m ; k++) {
            chaines.add(chaines.get(k));
        }
        for (int j = 0, h =0; h < m ; ) {
            chaines.remove(j);
            h++;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(chaines.get(i));
        }

    }
}
