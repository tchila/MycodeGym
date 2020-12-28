package fr.codegym.task.task05.task0527;

/* 
Tom et Jerry
*/

public class Solution {
    public static void main(String[] args) {
        Souris jerrySouris = new Souris("Jerry", 12, 5) ;
        Chat chat = new Chat("a",9,"s" );
        Chien chien = new Chien("a",9,"s" );

        //écris ton code ici
    }
    public static class Chat {

        private String nom;
        private int age;
        private String couleur;

        public Chat(String nom, int age, String couleur) {
            this.nom = nom;
            this.age = age;
            this.couleur = couleur;
        }
    }

    public static class Chien {

        private String nom;
        private int taille;
        private String couleur;

        public Chien(String nom, int taille, String couleur) {
            this.nom = nom;
            this.taille = taille;
            this.couleur = couleur;
        }
    }

    public static class Souris {
        String nom;
        int taille;
        int queue;

        public Souris(String nom, int taille, int queue) {
            this.nom = nom;
            this.taille = taille;
            this.queue = queue;
        }
    }

    //écris ton code ici
}
