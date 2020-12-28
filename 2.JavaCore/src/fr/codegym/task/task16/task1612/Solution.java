package fr.codegym.task.task16.task1612;

/* 
Chronomètre
*/

import org.omg.PortableServer.THREAD_POLICY_ID;

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Runner usain = new Runner("Usain", 4);
        Runner carl = new Runner("Carl", 2);
        // À vos marques !
        // Prêts ?
        // Partez !
        usain.start();
        carl.start();
        Thread.sleep(2000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Stopwatch extends Thread {
        private Runner owner;
        private int stepNumber;

        public Stopwatch(Runner runner) {
            this.owner = runner;
        }

        public void run() {
            try {
                while (!isStopped) {
                    doStep();
                }
            } catch (InterruptedException ignored) {
            }
        }

        private void doStep() throws InterruptedException {
            stepNumber++;
            // écris ton code ici
            Thread.sleep(1000 / owner.getSpeed());
            System.out.println(owner.getName() + " effectue l'étape " + stepNumber + " !");

        }
    }

    public static class Runner {
        Stopwatch stopwatch;
        private String name;
        private int speed;

        public Runner(String name, int speed) {
            this.name = name;
            this.speed = speed;
            this.stopwatch = new Stopwatch(this);
        }

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

        public void start() {
            stopwatch.start();
        }
    }
}
