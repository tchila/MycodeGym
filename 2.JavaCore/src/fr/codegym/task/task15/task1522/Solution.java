package fr.codegym.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Renforcer le modèle de singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    // Ajoute un bloc statique ici
    {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet()  {
        // Implémente l'étape #5 ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(Planet.EARTH.contains(s) )
            thePlanet = Earth.getInstance();
        else if(Planet.MOON.contains(s)  )
            thePlanet = Moon.getInstance();
        else if(Planet.SUN.contains(s) )
            thePlanet = Sun.getInstance();
        else
            thePlanet = null;
    }
}
