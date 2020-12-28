package fr.codegym.task.task05.task0517;

/* 
Création de chats
*/

public class Chat {
    //écris ton code ici
    //écris ton code ici
    private String nom;
    private int age;
    private int poids;
    private String adresse;
    private String couleur;


    public Chat(String nom){
        this.nom = nom;
        this.age = 1;
        this.poids = 2;
        this.couleur = "green";
    }

    public Chat(String nom, int poids, int age){
        this.nom = nom;
        this.age = age;
        this.poids = poids;
        this.couleur = "green";
    }
    public Chat(String nom, int age){
        this.nom = nom;
        this.age = age;
        this.poids = 2;
        this.couleur = "green";
    }

    public Chat( int poids, String couleur){
        this.poids = poids;
        this.couleur = couleur;
        this.age = 2;
    }
    public Chat(int poids, String couleur, String adresse){
        this.poids = poids;
        this.couleur = couleur;
        this.adresse = adresse;
        this.age = 9;
    }

    public static void main(String[] args) {

    }
}
