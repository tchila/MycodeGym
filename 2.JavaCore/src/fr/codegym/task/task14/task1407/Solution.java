package fr.codegym.task.task14.task1407;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Joueur et danseur
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("quitter")) {
            if ("joueur".equals(key)) {
                person = new Player();
            } else if ("danseur".equals(key)) {
                person = new Dancer();
            }
            haveFun(person);
        }
    }

    public static void haveFun(Person person) {
        //écris ton code ici
        if(person instanceof Player)
            ((Player) person).play();
        else if (person instanceof Dancer)
            ((Dancer) person).dance();
    }

    interface Person {
    }

    static class Player implements Person {
        void play() {
            System.out.println("joue");
        }
    }

    static class Dancer implements Person {
        void dance() {
            System.out.println("danse");
        }
    }
}
