package fr.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
La plus petite ou la plus longue chaîne
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici

        ArrayList<String> chaines = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int min = 0, max = 0 , indiceMax = 0, indiceMin = 0;
        String a = bufferedReader.readLine();
        chaines.add(a);
         min =max = a.length();
        for (int i = 0; i < 9 ; i++) {
            String b = bufferedReader.readLine();
            chaines.add(b);
            if(b.length()<min){
                min=b.length();
                indiceMin = i+1;
            }
            if(b.length()>max){
                max=b.length();
                indiceMax = i+1;

            }
        }
        if(indiceMax<indiceMin)
            System.out.println(chaines.get(indiceMax));
        else
            System.out.println(chaines.get(indiceMin));
    }
}
