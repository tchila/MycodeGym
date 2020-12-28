package fr.codegym.task.task07.task0726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Le code de Chat refuse de compiler
*/

public class Solution {
    public final static ArrayList<Chat> CHATS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String nom = lecteur.readLine();
            if (nom.isEmpty()  ) break;

            String age = lecteur.readLine();
            if  (age.isEmpty()) break;

            String poids = lecteur.readLine();
            if (poids.isEmpty() ) break;

            String longueurQueue = lecteur.readLine();
            if (longueurQueue.isEmpty()  ) break;

            int agen = Integer.parseInt(age);
            int poidsn = Integer.parseInt(poids);
            int longueurQueuen = Integer.parseInt(longueurQueue);


            Chat chat = new Chat(nom,agen,poidsn,longueurQueuen);
            CHATS.add(chat);
        }

        imprimerListe();
    }

    public static void imprimerListe() {
        for (Chat chat : CHATS) {
            System.out.println(chat);
        }
    }

    public static class Chat {
        private String nom;
        private int age;
        private int poids;
        private int longueurQueue;

        Chat(String nom, int age, int poids, int longueurQueue) {
            this.nom = nom;
            this.age = age;
            this.poids = poids;
            this.longueurQueue = longueurQueue;
        }

        @Override
        public String toString() {
            return "Nom du chat : " + nom + ", âge : " + age + ", poids : " + poids + ", queue : " + longueurQueue;
        }
    }
}