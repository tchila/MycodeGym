package fr.codegym.task.task05.task0509;

/* 
Créer une classe Ami
*/

public class Ami {
    //écris ton code ici
    private String nom;
    private int age;
    private char sexe;

    public void initialiser(String nom){
        this.nom = nom;
    }
    public void initialiser(String nom, int age){
        this.nom = nom;
        this.age = age;
    }
    public void initialiser(String nom, int age, char sexe){
        this.nom = nom;
        this.sexe = sexe;
        this.age = age;
    }

    public static void main(String[] args) {

    }
}
