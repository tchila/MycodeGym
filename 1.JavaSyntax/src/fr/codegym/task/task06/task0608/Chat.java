package fr.codegym.task.task06.task0608;

/* 
Méthodes static pour les chats
*/

public class Chat {
    private static int nombreChats = 0;

    public Chat() {
        nombreChats++;
    }

    public static int getNombreChats() {
        //écris ton code ici
        return nombreChats;

    }

    public static void setNombreChats(int nombreChats) {
        //écris ton code ici
        Chat.nombreChats = nombreChats;

    }

    public static void main(String[] args) {

    }
}
