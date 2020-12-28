package fr.codegym.task.task07.task0724;

/* 
Arbre généalogique
*/

public class Solution {
    public static void main(String[] args) {
        // écris ton code ici
        Humain grdPere = new Humain("ab", true,15);
        Humain grdPere1 = new Humain("fd", true,56);
        Humain grdMere = new Humain("cc", false,74);
        Humain grdMere1 = new Humain("affb", false,32);
        Humain pere = new Humain("ss", true,21,grdPere,grdMere);
        Humain mere = new Humain("xc", false,28,grdPere1,grdMere1);
        Humain fils1 = new Humain("q", true,15,pere,mere);
        Humain fille = new Humain("f", false,9,pere,mere);
        Humain fils2 = new Humain("n", true,12,pere,mere);

        System.out.println(grdPere);
        System.out.println(grdMere);
        System.out.println(grdPere1);
        System.out.println(grdMere1);
        System.out.println(pere);
        System.out.println(mere);
        System.out.println(fils1);
        System.out.println(fils2);
        System.out.println(fille);
    }

    public static class Humain {
        // écris ton code ici
        String nom;
        boolean sexe;
        int age;
        Humain pere ,  mere;

        public Humain(String nom, boolean sexe, int age) {
            this.nom = nom;
            this.sexe = sexe;
            this.age = age;
        }

        public Humain(String nom, boolean sexe, int age, Humain pere, Humain mere) {
            this.nom = nom;
            this.sexe = sexe;
            this.age = age;
            this.pere = pere;
            this.mere = mere;
        }

        public String toString() {
            String texte = "";
            texte += "Nom : " + this.nom;
            texte += ", sexe : " + (this.sexe ? "masculin" : "féminin");
            texte += ", âge : " + this.age;

            if (this.pere != null)
                texte += ", père : " + this.pere.nom;

            if (this.mere != null)
                texte += ", mère : " + this.mere.nom;

            return texte;
        }
    }
}