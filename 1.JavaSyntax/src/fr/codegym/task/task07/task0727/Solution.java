package fr.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Changement de fonctionnalité
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> liste = new ArrayList<String>();
        while (true) {
            String s = lecteur.readLine();
            if (s.isEmpty()) break;
            liste.add(s);
        }

        ArrayList<String> listeMajuscule = new ArrayList<String>();
        for (String s : liste) {
            if (s.length() % 2 == 0) {
                listeMajuscule.add(s);
                listeMajuscule.add(s);
            } else {
                listeMajuscule.add(s);
                listeMajuscule.add(s);
                listeMajuscule.add(s);
            }
        }
        for (int i = 0; i < listeMajuscule.size(); i++) {
            if(listeMajuscule.get(i).length()%2==0) {
                System.out.print(listeMajuscule.get(i)+ " ");
                i+=1;
                System.out.println(listeMajuscule.get(i));
            }else{
                System.out.print(listeMajuscule.get(i)+ " ");
                i+=1;
                System.out.print(listeMajuscule.get(i)+ " ");
                i+=1;
                System.out.println(listeMajuscule.get(i));
            }


        }
    }
}
