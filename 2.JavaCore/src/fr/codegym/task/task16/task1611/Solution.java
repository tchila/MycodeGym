package fr.codegym.task.task16.task1611;

/* 
Horloges
*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread.sleep(2000);
        isStopped = true;
        System.out.println("l'horloge doit être arrêtée");
        Thread.sleep(2000);
        System.out.println("Double vérification");
    }

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTickTock();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTickTock() throws InterruptedException {
            //écris ton code ici
            System.out.println("Tic");
            Thread.sleep(500);
            System.out.println("Toc");
            Thread.sleep(500);
        }
    }
}
