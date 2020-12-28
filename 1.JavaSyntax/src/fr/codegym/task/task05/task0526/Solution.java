package fr.codegym.task.task05.task0526;

/* 
Hommes et femmes
*/

public class Solution {
    public static void main(String[] args) {
        //écris ton code ici
        Homme homme = new Homme("a",1,"z");
        Homme homme1 = new Homme("b",1,"z");
        Femme femme = new Femme("a",1,"z");
        Femme femme1 = new Femme("b",1,"z");

        System.out.println(homme1);
        System.out.println(homme);
        System.out.println(femme1);
        System.out.println(femme);
    }

    //écris ton code ici
    public static class Homme{
        String nom, adresse;
        int age ;

        public Homme(String nom, int age, String adresse ) {
            this.nom = nom;
            this.adresse = adresse;
            this.age = age;
        }


        public String toString() {
            return nom + " " + age + " " + adresse;
        }
    }

    public static class Femme{
        String nom, adresse;
        int age ;

        public Femme(String nom, int age, String adresse) {
            this.nom = nom;
            this.adresse = adresse;
            this.age = age;
        }

        public String toString() {
            return nom + " " + age + " " + adresse;
        }
    }
}
