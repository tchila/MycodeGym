package fr.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Relations avec les chats
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        String grandPere = lecteur.readLine();
        Chat grandPereChat = new Chat(grandPere);

        String grandMere = lecteur.readLine();
        Chat grandMereChat = new Chat(grandMere);

        String pere = lecteur.readLine();
        Chat pereChat = new Chat(pere,grandPereChat);

        String mere = lecteur.readLine();
        Chat mereChat = new Chat(grandMereChat, mere);


        String fils = lecteur.readLine();
        Chat filsChat = new Chat(fils, mereChat, pereChat);

        String fille = lecteur.readLine();
        Chat filleChat = new Chat(fille, mereChat, pereChat);

        System.out.println(grandPereChat);
        System.out.println(grandMereChat);
        System.out.println(pereChat);
        System.out.println(mereChat);
        System.out.println(filsChat);
        System.out.println(filleChat);
    }

    public static class Chat {
        private String nom;
        private Chat mere;
        private Chat pere;

        Chat(String nom) {
            this.nom = nom;
            this.mere = null;
            this.pere = null;
        }

        Chat(String nom, Chat mere, Chat pere) {
            this.nom = nom;
            this.mere = mere;
            this.pere = pere;
        }

        Chat(String nom,  Chat pere) {
            this.nom = nom;
            this.pere = pere;
            this.mere = null;
        }

        Chat( Chat mere, String nom) {
            this.nom = nom;
            this.mere = mere;
            this.pere = null;
        }


        @Override
        public String toString() {
            if (pere == null && mere == null)
                return "Le nom du chat est " + nom + ", pas de mère, pas de père";
            else if (pere == null && mere != null)
                return "Le nom du chat est " + nom + ", " + mere.nom + " est sa mère"+", pas de père" ;
            else if (pere != null && mere == null)
                return "Le nom du chat est " + nom +", pas de mère" + ", " + pere.nom + " est son père";
            else
                return "Le nom du chat est " + nom + ", " + mere.nom + " est sa mère"+ ", " + pere.nom + " est son père";
        }
    }

}
