package fr.codegym.task.task16.task1605;

import java.util.Date;

/* 
Parlons musique
*/

public class Solution {
    public static int delay = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Joueur"));
        violin.start();
    }

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable {
        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument {
        private String owner;

        @Override
        public void run() {
            Date datedebut = startPlaying();
            sleepNSeconds(1);
            Date datefin  = stopPlaying();

            System.out.println("A joué pendant "+ (datefin.getTime() - datedebut.getTime()) + " ms");
        }

        public Violin(String owner) {
            this.owner = owner;
        }

        public Date startPlaying() {
            System.out.println(this.owner + " commence à jouer");
            return new Date();
        }

        public Date stopPlaying() {
            System.out.println(this.owner + " cesse de jouer");
            return new Date();
        }
    }
}
