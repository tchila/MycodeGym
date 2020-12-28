package fr.codegym.task.task05.task0502;

/* 
Implémenter la méthode combattre
*/

public class Chat {
    public int age;
    public int poids;
    public int force;

    public Chat() {
    }

    public boolean combattre(Chat autreChat) {
        //écris ton code ici
        return(this.age > autreChat.age && this.poids > autreChat.poids && this.force > autreChat.force);
    }

    public static void main(String[] args) {

    }
}
