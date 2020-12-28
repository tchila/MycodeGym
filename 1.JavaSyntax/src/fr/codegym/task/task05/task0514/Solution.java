package fr.codegym.task.task05.task0514;

/* 
Un programmeur crée une personne
*/

public class Solution {
    public static void main(String[] args) {
        //écris ton code ici
        Personne personne = new Personne();
        personne.initialiser("toto",4);
    }

    static class Personne {
        //écris ton code ici
        String nom;
        int age;

        public void initialiser(String nom, int age){
            this.nom =nom;
            this.age =age;
        }
    }
}
