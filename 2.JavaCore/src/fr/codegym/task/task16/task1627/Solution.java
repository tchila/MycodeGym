package fr.codegym.task.task16.task1627;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        public static volatile boolean isWinnerFound = false;

        public static List<String> actions = new ArrayList<>();

        static {
            actions.add("Commencer partie");
            actions.add("Rassembler des ressources");
            actions.add("Stimuler l'économie");
            actions.add("Tuer les ennemis");
        }

        protected Gamer gamer1 = new Gamer("Smith", 3);
        protected Gamer gamer2 = new Gamer("Jones", 1);
        protected Gamer gamer3 = new Gamer("Gates", 5);

        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound) {
            }
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();
        }
    }

    public static class Gamer extends Thread {
        private int rating;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run() {
            //écris ton code ici

            for (String action : OnlineGame.actions) {
                System.out.println(this.getName() + ":" + action);
                try {
                    Thread.sleep(1000/rating);
                } catch (InterruptedException e) {
                    System.out.println(this.getName() + ":a perdu!");
                    return;
                }
            }
            if (!OnlineGame.isWinnerFound) {
                OnlineGame.isWinnerFound = true;
                System.out.println(this.getName() + ":a gagné!");
            }



        }
    }
}
