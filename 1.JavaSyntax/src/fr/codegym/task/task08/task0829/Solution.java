package fr.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Mise à jour logicielle
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        // Liste d'adresses
        Map<String,String> map = new HashMap<>();
        while (true) {
            String ville = lecteur.readLine();
            if (ville.isEmpty()) break;
            String famille = lecteur.readLine();
            if (famille.isEmpty()) break;
            map.put(ville,famille);
        }

        // Lit le numéro de la maison
        String villex = lecteur.readLine();
        System.out.println(map.get(villex));

    }
}
