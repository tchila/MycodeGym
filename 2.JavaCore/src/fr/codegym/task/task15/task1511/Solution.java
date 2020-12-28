package fr.codegym.task.task15.task1511;

import java.io.Serializable;

/* 
Le code le plus simple : partie 1
*/

public class Solution {
    public static void main(String[] args) {
        JuniorJavaDev me = new JuniorJavaDev();
        System.out.println(me.askHubert("Que penses-tu de fr.codegym.task.task15.task1511 ?"));
        System.out.println(me.askZapp("Quand aura lieu la prochaine mise à jour ?"));
    }

    public interface SpecificSerializable extends Serializable {
    }

    public static class JavaDev implements SpecificSerializable {
        String answerQuestion(String question) {
            return String.format("Je vais réfléchir à [%s]", question);
        }
    }

    public static class JuniorJavaDev extends JavaDev {
        JavaDev zapp = new JavaDev();
        JavaDev hubert = new JavaDev();

        String askZapp(String question) {
            return zapp.answerQuestion(question);
        }

        String askHubert(String question) {
            return hubert.answerQuestion(question);
        }
    }
}
