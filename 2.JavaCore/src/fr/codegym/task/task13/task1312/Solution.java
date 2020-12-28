package fr.codegym.task.task13.task1312;

/* 
Le code ne se corrige pas tout seul
*/

public class Solution {
    public static void main(String[] args) {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public  static class Translator {
        public String translate() {
            return "Je traduis depuis la langue : russe";
        }
    }


}