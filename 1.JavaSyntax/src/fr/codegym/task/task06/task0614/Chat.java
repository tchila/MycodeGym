package fr.codegym.task.task06.task0614;


import java.util.ArrayList;

/* 
Chats static
*/

public class Chat {
    //écris ton code ici

    public String toString(int i) {
        return "Chat{} : "+i;
    }

    public static ArrayList<Chat> chats = new ArrayList<>();
    public Chat() {
    }

    public static void main(String[] args) {
        //écris ton code ici
        for (int i = 0; i < 10; i++) {
            Chat chat = new Chat();
            chats.add(chat);
        }
        imprimerChats();
    }

    public static void imprimerChats() {
        //écris ton code ici
        chats.stream().forEach(System.out::println);
    }


}
