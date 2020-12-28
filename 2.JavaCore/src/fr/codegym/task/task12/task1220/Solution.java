package fr.codegym.task.task12.task1220;

/* 
Classe Human et interfaces CanRun et CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }

    // Ajoute les interfaces publiques et une classe publique ici

    public static abstract class  Human implements CanRun, CanSwim {
    }

     public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }
}

