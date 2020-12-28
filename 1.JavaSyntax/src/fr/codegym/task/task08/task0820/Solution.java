package fr.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Ensemble d'animaux
*/

public class Solution {
    public static void main(String[] args) {
        Set<Chat> chats = creerChats();
        Set<Chien> chiens = creerChiens();

        Set<Object> animaux = jointure(chats, chiens);
        imprimerAnimaux(animaux);

        supprimerChats(animaux, chats);
        imprimerAnimaux(animaux);
    }

    public static Set<Chat> creerChats() {
        HashSet<Chat> resultat = new HashSet<Chat>();

        //écris ton code ici
        Chat chat = new Chat();
        Chat chat1 = new Chat();
        Chat chat2 = new Chat();
        Chat chat3 = new Chat();
        resultat.add(chat);
        resultat.add(chat1);
        resultat.add(chat2);
        resultat.add(chat3);

        return resultat;
    }

    public static Set<Chien> creerChiens() {
        //écris ton code ici
        Set<Chien> chiens = new HashSet<>();
        Chien chien = new Chien();
        Chien chien1 = new Chien();
        Chien chien2 = new Chien();
        chiens.add(chien);
        chiens.add(chien1);
        chiens.add(chien2);
        return chiens;
    }

    public static Set<Object> jointure(Set<Chat> chats, Set<Chien> chiens) {
        //écris ton code ici
        Set jointures = new HashSet<>();
        jointures.addAll(chats);
        jointures.addAll(chiens);
        return jointures;
    }

    public static void supprimerChats(Set<Object> animaux, Set<Chat> chats) {
        //écris ton code ici
        animaux.removeIf(chats::contains);

    }

    public static void imprimerAnimaux(Set<Object> animaux) {
        //écris ton code ici
        for (Object animal:
                animaux) {
            System.out.println(animal);
        }
    }

    //écris ton code ici
    public static class Chat{
        public Chat() {
        }
    }
    public static class Chien{
        public Chien() {
        }
    }
}
