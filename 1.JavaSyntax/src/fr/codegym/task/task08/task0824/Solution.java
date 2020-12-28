package fr.codegym.task.task08.task0824;

/* 
Créons une famille
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //écris ton code ici
        Humain enfant = new Humain("q", true,5, new ArrayList<>());
        Humain enfant1 = new Humain("d", false,15, new ArrayList<>());
        Humain enfant2= new Humain("x", true,8, new ArrayList<>());
        ArrayList<Humain> enfants = new ArrayList<>(Arrays.asList(enfant,enfant1,enfant2));
        Humain pere = new Humain("p", true,41,enfants);
        Humain mere = new Humain("m", false,38,enfants);
        ArrayList<Humain> enfantsP = new ArrayList<>(Arrays.asList(pere));
        ArrayList<Humain> enfantsM = new ArrayList<>(Arrays.asList(mere));
        Humain gp1 = new Humain("gp1", true,87,enfantsP);
        Humain gm1 = new Humain("gm1", false,80,enfantsP);
        Humain gp2 = new Humain("gp2", true,91,enfantsM);
        Humain gm2 = new Humain("gm2", false,88,enfantsM);

        ArrayList<Humain> humains = new ArrayList<>(Arrays.asList(enfant,enfant1,enfant2,pere,mere,gm1,gm2,gp1,gp2));

        for (Humain h :
                humains) {
            System.out.println(h.toString());
        }

    }

    public static class Humain {
        //écris ton code ici
        String nom;
        boolean sexe;
        int age;
        ArrayList<Humain> enfants;



        public Humain(String nom, boolean sexe, int age, ArrayList<Humain> enfants) {
            this.nom = nom;
            this.sexe = sexe;
            this.age = age;
            this.enfants = enfants;
        }

        public String toString() {
            String texte = "";
            texte += "Nom : " + this.nom;
            texte += ", sexe : " + (this.sexe ? "masculin" : "féminin");
            texte += ", âge : " + this.age;

            int nombreEnfants = this.enfants.size();
            if (nombreEnfants > 0) {
                texte += ", enfants : " + this.enfants.get(0).nom;

                for (int i = 1; i < nombreEnfants; i++) {
                    Humain enfant = this.enfants.get(i);
                    texte += ", " + enfant.nom;
                }
            }
            return texte;
        }
    }

}
