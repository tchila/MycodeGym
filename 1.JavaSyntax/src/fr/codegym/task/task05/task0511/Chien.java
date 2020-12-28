package fr.codegym.task.task05.task0511;

/* 
Créer une classe Chien
*/

public class Chien {
    //écris ton code ici
    private String nom;
    private int taille;
    private String couleur;

    public void initialiser(String nom){
        this.nom = nom;
    }

    public void initialiser(String nom, int taille){
        this.nom = nom;
        this.taille = taille;
    }

    public void initialiser(String nom, int taille, String couleur){
        this.nom = nom;
        this.taille = taille;
        this.couleur = couleur;
    }


    public static void main(String[] args) {

    }
}
