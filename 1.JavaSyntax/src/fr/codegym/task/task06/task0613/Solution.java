package fr.codegym.task.task06.task0613;

/* 
Chat et static
*/

public class Solution {
    public static void main(String[] args) {
        // Crée 10 chats
        for (int i = 0; i < 10; i++) {
            Chat chat = new Chat();
        }
        System.out.println(Chat.nombreChats);

        // Affiche la valeur de la variable nombreChats
    }

    public static class Chat {
        // Crée une variable static nombreChats
        public static int nombreChats;

        // Déclare un constructeur
        public Chat(){
            nombreChats++;
        }
    }
}
