package fr.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Ensemble de chats
*/

public class Solution {
    public static void main(String[] args) {
        Set<Chat> chats = creerChats();
        for (Chat chat:
             chats) {
            chats.remove(chat);
            break;
        }

        //écris ton code ici. Étape 3

        imprimerChats(chats);
    }

    public static Set<Chat> creerChats() {
        //écris ton code ici. Étape 2
        Set<Chat> chats = new HashSet<>();
        Chat chat = new Chat();
        Chat chat1 = new Chat();
        Chat chat2 = new Chat();
        chats.add(chat);
        chats.add(chat1);
        chats.add(chat2);
        return chats;
    }

    public static void imprimerChats(Set<Chat> chats) {
        // Étape 4
        for (Chat chat:
                chats) {
            System.out.println(chat);
        }
    }

    // Étape 1
    public static class Chat{
        public Chat() {
        }
    }
}
