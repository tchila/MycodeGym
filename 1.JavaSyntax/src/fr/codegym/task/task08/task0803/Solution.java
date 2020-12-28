package fr.codegym.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;

/* 
HashMap de chats
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] chats = new String[]{"Tiger", "Missy", "Smokey", "Marmalade", "Oscar", "Snowball", "Boss", "Smudge", "Max", "Simba"};

        HashMap<String, Chat> map = ajouterChatsAMap(chats);

        for (Map.Entry<String, Chat> paire : map.entrySet()) {
            System.out.println(paire.getKey() + " - " + paire.getValue());
        }
    }


    public static HashMap<String, Chat> ajouterChatsAMap(String[] chats) {
        //écris ton code ici
        HashMap<String, Chat> map = new HashMap<String, Chat>();
        for (String s :
                chats) {
            map.put(s,new Chat(s));
        }
        return map;

    }


    public static class Chat {
        String nom;

        public Chat(String nom) {
            this.nom = nom;
        }

        @Override
        public String toString() {
            return nom != null ? nom.toUpperCase() : null;
        }
    }
}
