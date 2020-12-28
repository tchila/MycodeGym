package fr.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Dix chats
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Chat> map = creerMap();
        Set<Chat> ensemble = convertirMapEnSet(map);
        imprimerSetChats(ensemble);
    }

    public static Map<String, Chat> creerMap() {
        //écris ton code ici
        Map<String,Chat> chatMap = new HashMap<>();
        chatMap.put("a",new Chat("a"));
        chatMap.put("B",new Chat("B"));
        chatMap.put("C",new Chat("C"));
        chatMap.put("D",new Chat("D"));
        chatMap.put("E",new Chat("E"));
        chatMap.put("F",new Chat("F"));
        chatMap.put("G",new Chat("G"));
        chatMap.put("H",new Chat("H"));
        chatMap.put("I",new Chat("I"));
        chatMap.put("J",new Chat("J"));
        return chatMap;
    }

    public static Set<Chat> convertirMapEnSet(Map<String, Chat> map) {
        //écris ton code ici
        Set<Chat> chats = new HashSet<>();
        for (Chat s:
                map.values()) {
            chats.add(s);
        }
        return  chats;
    }

    public static void imprimerSetChats(Set<Chat> ensemble) {
        for (Chat chat : ensemble) {
            System.out.println(chat);
        }
    }

    public static class Chat {
        private String nom;

        public Chat(String nom) {
            this.nom = nom;
        }

        public String toString() {
            return "Chat " + this.nom;
        }
    }


}
