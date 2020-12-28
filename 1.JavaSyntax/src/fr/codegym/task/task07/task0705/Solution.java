package fr.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Un grand tableau et deux petits
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        int[] nbre =  new int[20];
        int[] nbre1 =  new int[10];
        int[] nbre2 =  new int[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < nbre.length; i++) {
            nbre[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i = 0; i < nbre.length; i++) {
            if(i < 10)
                nbre1[i] =nbre[i];
            else {
                nbre2[i-10] = nbre[i];
                System.out.println(nbre2[i-10]);
            }

        }
    }
}
