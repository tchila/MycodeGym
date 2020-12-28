package fr.codegym.task.task05.task0518;

/* 
Enregistrement de chiens
*/


public class Chien {
    //écris ton code ici
    private String nom;
    private int taille;
    private String couleur;
    public Chien(String nom){
        this.nom = nom;
    }

    public Chien(String nom, int taille){
        this.nom = nom;
        this.taille = taille;
    }

    public Chien(String nom, int taille, String couleur){
        this.nom = nom;
        this.taille = taille;
        this.couleur = couleur;
    }

    public static void main(String[] args) {

    }
}
