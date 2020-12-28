package fr.codegym.task.task16.task1617;

/* 
Compte à rebours pour une course
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
        //écris ton code ici
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //écris ton code ici
            boolean iscancel = false;
            while (numSeconds>0){
                try {
                    System.out.print(numSeconds-- + " ");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.print("Interrompu !" );
                    iscancel=true;
                }
            }
            if(!iscancel){
                System.out.print("Partez !" );
            }
        }
    }
}
