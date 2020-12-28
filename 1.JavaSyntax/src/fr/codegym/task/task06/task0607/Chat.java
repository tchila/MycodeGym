package fr.codegym.task.task06.task0607;

/* 
Compteur de classe
*/

public class Chat {
    //écris ton code ici
    public static int nombreChats = 0;

    public Chat() {
        nombreChats++;
    }

    public static int getNombreChats() {
        return nombreChats;
    }

    public static void setNombreChats(int nombreChats) {
        Chat.nombreChats = nombreChats;
    }

    public static void main(String[] args) {

    }
}
