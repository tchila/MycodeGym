package fr.codegym.task.task09.task0924;

import java.util.ArrayList;

/* 
Un conte de fées effrayant
*/

public class Solution {
    public static PetitChaperonRouge chaperon = new PetitChaperonRouge();
    public static Meregrand meregrand = new Meregrand();
    public static Galette galette = new Galette();
    public static Bucheron bucheron = new Bucheron();
    public static Loup loup = new Loup();

    public static void main(String[] args) {
        // écris to code ici

        loup.manges.add(galette);
        bucheron.tues.add(loup);
    }

    // Petit chaperon rouge
    public static class PetitChaperonRouge extends ObjetHistoire {
    }

    // Mère-grand
    public static class Meregrand extends ObjetHistoire {
    }

    // Galette
    public static class Galette extends ObjetHistoire {
    }

    // Bûcheron
    public static class Bucheron extends ObjetHistoire {
    }

    // Loup
    public static class Loup extends ObjetHistoire {
    }

    public static abstract class ObjetHistoire {
        public ArrayList<ObjetHistoire> tues = new ArrayList<>();
        public ArrayList<ObjetHistoire> manges = new ArrayList<>();
    }
}
