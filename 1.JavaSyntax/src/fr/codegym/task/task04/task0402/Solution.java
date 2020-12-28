package fr.codegym.task.task04.task0402;

/* 
Prix des pommes
*/
public class Solution {
    public static void main(String[] args) {
        Pomme pomme = new Pomme();
        pomme.ajouterPrix(50);
        Pomme pomme2 = new Pomme();
        pomme2.ajouterPrix(100);
        System.out.println("Le coût des pommes est de " + Pomme.prixPomme);
    }

    public static class Pomme {
        public static int prixPomme = 0;

        public static void ajouterPrix(int prix) {
            //écris ton code ici
            prixPomme +=prix;
        }
    }
}
