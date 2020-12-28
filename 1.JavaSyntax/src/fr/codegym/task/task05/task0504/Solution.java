package fr.codegym.task.task05.task0504;


/* 
Les trois « Miaousquetaires »
*/

public class Solution {
    public static void main(String[] args) {
        //écris ton code ici
        Chat chat = new Chat("a",1,2,3);
        Chat chat1 = new Chat("b",14,28,6);
        Chat chat2 = new Chat("c",16,7,3);
    }

    public static class Chat {
        private String nom;
        private int age;
        private int poids;
        private int force;

        public Chat(String nom, int age, int poids, int force) {
            this.nom = nom;
            this.age = age;
            this.poids= poids;
            this.force = force;
        }
    }
}