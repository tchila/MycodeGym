package fr.codegym.task.task05.task0525;

/* 
Le canard entier ne suffit pas
*/

public class Solution {

    public static void main(String[] args) {
        Canard canard1 = new Canard();
        Canard canard2 = new Canard();
        Chien chien1 = new Chien();
        Chien chien2 = new Chien();
        Chat chat1 = new Chat();
        Chat chat2 = new Chat();
        System.out.println(canard1);
        System.out.println(canard2);
        System.out.println(chat1);
        System.out.println(chat2);
        System.out.println(chien1);
        System.out.println(chien2);


        //écris ton code ici
    }

    public static class Canard {
        public String toString() {
            return "Canard";
        }
    }

    public static class Chien {
        public String toString() {
            return "Chien";
        }
    }


    public static class Chat {
        public String toString() {
            return "Chat";
        }
    }


    //écris ton code ici
}
