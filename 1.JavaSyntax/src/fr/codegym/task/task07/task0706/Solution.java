package fr.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Des rues et des maisons
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici

        int[] nbre =  new int[15];
        int sommePair = 0, sommeImpair = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < nbre.length; i++) {
            nbre[i] = Integer.parseInt(bufferedReader.readLine());
            if (i%2 == 0 )
                sommePair+=nbre[i];
            else
                sommeImpair+=nbre[i];
        }
        if(sommePair>sommeImpair)
            System.out.println("Les maisons à numéro pair ont plus de résidents.");
        else
            System.out.println("Les maisons à numéro impair ont plus de résidents.");
    }
}
