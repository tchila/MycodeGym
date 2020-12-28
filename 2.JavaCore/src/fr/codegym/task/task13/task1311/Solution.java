package fr.codegym.task.task13.task1311;

/* 
Embauchons un traducteur
*/

public class Solution {
    public static void main(String[] args) {
        RussianTranslator russianTranslator = new RussianTranslator();
        System.out.println(russianTranslator.translate());
    }

    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate() {
            return "Je traduis depuis la langue : " + getLanguage();
        }
    }

    static class RussianTranslator extends Translator{
        @Override
        public String getLanguage() {
            return "russe";
        }
    }

}