package fr.codegym.task.task14.task1404;

/* 
Chats
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        List<String> noms = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String nom = bufferedReader.readLine();
            if(nom.isEmpty()) break;
            noms.add(nom);
        }

        for (String s :
                noms) {
            System.out.println(CatFactory.getCatByKey(s));
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("sauvage".equals(key)) {
                cat = new MeanCat("Griffeur");
            } else if ("miss".equals(key)) {
                cat = new NiceCat("Missy");
            } else if ("fil".equals(key)) {
                cat = new NiceCat("Filoute");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Je m'appelle " + getName() + ", et je suis un chat de gouttière";
        }
    }

    static class MeanCat extends Cat {
        MeanCat(String name) {
            super(name);
        }

        public String toString() {
            return "Je m'appelle " + getName() + ", et je vais t'arracher les yeux";
        }
    }

    static class NiceCat extends Cat {
        NiceCat(String name) {
            super(name);
        }

        public String toString() {
            return "Je suis un gentil chaton et je m'appelle " + getName();
        }
    }
}
