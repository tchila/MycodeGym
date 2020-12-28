package fr.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Vérification d'ordre
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //écris ton code ici
        ArrayList<String> chaines = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String b = bufferedReader.readLine();
            chaines.add(b);
        }

        for (int i = 1; i < chaines.size(); i++ ) {
            if(chaines.get(i).length()<chaines.get(i-1).length()){
                System.out.println(i);
            }
        }
    }
}

