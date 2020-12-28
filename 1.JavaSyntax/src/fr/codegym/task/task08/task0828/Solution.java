package fr.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;

/* 
Nombre du mois
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //écris ton code ici
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        String mois =lecteur.readLine();
        int k = 0;
        ArrayList<String> months = new ArrayList<>(Arrays.asList("Janvier","Février","Mars","Avril","Mai","Juin","Juillet","Août","Septembre","Octobre","Novembre","Décembre"));
        //ArrayList<String> months = new ArrayList<>(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));
        for (int i = 0; i < months.size() ;i++) {
            if(mois.equalsIgnoreCase(months.get(i))){
                k=i+1;
                break;
            }

        }
        System.out.print(mois + " est le mois numéro " + k);
    }
}
