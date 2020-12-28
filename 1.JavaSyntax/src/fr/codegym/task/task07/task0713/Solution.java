package fr.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Jouons à Javarella
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        ArrayList<Integer> chaines = new ArrayList<>();
        ArrayList<Integer> chaines3 = new ArrayList<Integer>();
        ArrayList<Integer> chaines2 = new ArrayList<Integer>();
        ArrayList<Integer> chainesX = new ArrayList<Integer>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20 ; i++) {
            String b = bufferedReader.readLine();
            chaines.add(Integer.parseInt(b));
        }

        for (Integer chaine : chaines) {
            if (chaine % 3 == 0)
                chaines3.add(chaine);
            if (chaine % 2 == 0)
                chaines2.add(chaine);
            if (chaine % 2 != 0 && chaine % 3 != 0)
                chainesX.add(chaine);
        }

        imprimerListe(chaines3);
        imprimerListe(chaines2);
        imprimerListe(chainesX);
    }

    public static void imprimerListe(List<Integer> liste) {
        //écris ton code ici
        for (Integer i :
                liste) {
            System.out.println(i);
        }
    }
}
