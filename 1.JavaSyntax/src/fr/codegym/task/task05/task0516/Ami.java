package fr.codegym.task.task05.task0516;

/* 
Les amis, ça ne s'achète pas
*/

public class Ami {
    //écris ton code ici

    private String nom;
    private int age;
    private char sexe;

    public  Ami(String nom){
        this.nom = nom;
    }
    public  Ami(String nom, int age){
        this.nom = nom;
        this.age = age;
    }
    public  Ami(String nom, int age, char sexe){
        this.nom = nom;
        this.sexe = sexe;
        this.age = age;
    }

    public static void main(String[] args) {

    }
}
