package fr.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Fin
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        //écris ton code ici
        ArrayList<String> chaines = new ArrayList<String>();
        while (true)
        {
            String b = lecteur.readLine();
            if (b.equals("fin"))
                break;
            chaines.add(b);
        }
        //écris ton code ici
        for (String chaine : chaines) {
            System.out.println(chaine);
        }
    }
}