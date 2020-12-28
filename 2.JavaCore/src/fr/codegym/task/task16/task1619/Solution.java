package fr.codegym.task.task16.task1619;

/* 
Pas d'interruption, pas de dés ?
*/

public class Solution {
    public static volatile boolean iscancel = false;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterrupt();
    }

    public static void ourInterrupt() {
        iscancel = true;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (!iscancel) {
                try {
                    System.out.println("hé-hé");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
