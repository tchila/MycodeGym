package fr.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/* 
Mission sur les algorithmes
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> liste = new ArrayList<String>();
        while (true) {
            String s = lecteur.readLine();
            if (s.isEmpty()) break;
            liste.add(s);
        }

        String[] tableau = liste.toArray(new String[liste.size()]);
        tri(tableau);

        for (String x : tableau) {
            System.out.println(x);
        }
    }

    public static void tri(String[] tableau) {
        // écris ton code ici
        HashMap<Integer,String> nombres = new HashMap<>();
        HashMap<Integer,String> strings = new HashMap<>();
        for (int i = 0; i <tableau.length ; i++) {
            if(estUnNombre(tableau[i])){
                nombres.put(i,tableau[i]);
            }else
                strings.put(i,tableau[i]);
        }

        List<Integer> indexNbrs;
        List<Integer> indexStrs;
        indexNbrs = nombres.keySet().stream().mapToInt(i -> i).boxed().collect(Collectors.toList());
        indexStrs = strings.keySet().stream().mapToInt(i -> i).boxed().sorted().collect(Collectors.toList());
        Collections.sort(indexNbrs);

        for (int i = indexStrs.size()-1; i > 0 ; i--){
            for (int j = 0; j <i ; j++) {
                if(estSuperieurA(strings.get(indexStrs.get(j)),strings.get(indexStrs.get(j+1)))){
                    String tmp = strings.get(indexStrs.get(j));
                    strings.put(indexStrs.get(j),strings.get(indexStrs.get(j+1))) ;
                    strings.put(indexStrs.get(j+1),tmp) ;
                }
            }
        }


        for (int i = indexNbrs.size()-1; i > 0 ; i--){
            for (int j = 0; j <i ; j++) {
                if(Integer.parseInt(nombres.get(indexNbrs.get(j)))< Integer.parseInt(nombres.get(indexNbrs.get(j+1)))){
                    String tmp = nombres.get(indexNbrs.get(j));
                    nombres.put(indexNbrs.get(j),nombres.get(indexNbrs.get(j+1))) ;
                    nombres.put(indexNbrs.get(j+1),tmp) ;
                }
            }
        }
        for (int i :
                nombres.keySet()) {
            tableau[i] = nombres.get(i);
        }
        for (int i :
                strings.keySet()) {
            tableau[i] = strings.get(i);
        }
    }

    // Méthode de comparaison de chaînes : 'a' est supérieur à 'b'
    public static boolean estSuperieurA(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // La chaîne passée est-elle est un nombre ?
    public static boolean estUnNombre(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // La chaîne contient un trait d'union
                    || (!Character.isDigit(c) && c != '-') // ou n'est pas un nombre et ne commence pas par un trait d'union
                    || (i == 0 && c == '-' && chars.length == 1)) // ou est seulement un trait d'union
            {
                return false;
            }
        }
        return true;
    }
}
