package fr.codegym.task.task06.task0611;

/* 
Classe AssistantChaine
*/

public class AssistantChaine {
    public static String multiplier(String s) {
        String resultat = "";
        //écris ton code ici
        for (int i = 0; i < 5; i++) {
            resultat +=s;
        }
        return resultat;
    }

    public static String multiplier(String s, int total) {
        String resultat = "";
        //écris ton code ici
        for (int i = 0; i < total; i++) {
            resultat +=s;
        }
        return resultat;
    }

    public static void main(String[] args) {

    }
}
