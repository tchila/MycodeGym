package fr.codegym.task.task05.task0505;

/* 
Carnage félin
*/

public class Solution {
    public static void main(String[] args) {
        //écris ton code ici
        Chat chat =  new Chat("a",1,2,3);
        Chat chat1 = new Chat("b",14,28,6);
        Chat chat2 = new Chat("c",16,7,3);

        System.out.println(chat.combattre(chat1));
        System.out.println(chat.combattre(chat2));
        System.out.println(chat2.combattre(chat1));
    }

    public static class Chat {
        protected String nom;
        protected int age;
        protected int poids;
        protected int force;

        public Chat(String nom, int age, int poids, int force) {
            this.nom = nom;
            this.age = age;
            this.poids= poids;
            this.force = force;
        }

        public boolean combattre(Chat autreChat) {
            int avantageAge = this.age > autreChat.age ? 1 : 0;
            int avantagePoids = this.poids > autreChat.poids ? 1 : 0;
            int avantageForce = this.force > autreChat.force ? 1 : 0;

            int score = avantageAge + avantagePoids + avantageForce;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
