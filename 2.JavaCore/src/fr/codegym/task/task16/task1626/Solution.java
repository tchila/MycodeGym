package fr.codegym.task.task16.task1626;

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Réduction").start();
        new Thread(new CountUpRunnable(), "Augmentation").start();
    }

    public static class CountUpRunnable implements Runnable{
        private int countupIndex = Solution.number;

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    Thread.sleep(500);
                    countupIndex -= 1;
                    if (countupIndex == 0) return;
                }
            } catch (InterruptedException e) {

            }
        }
        //écris ton code ici
        public String toString() {
            return Thread.currentThread().getName() + " : " + countupIndex;
        }

    }


    public static class CountdownRunnable implements Runnable {
        private int countdownIndex = Solution.number;
        int i =0;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    i+= 1;
                    if (i == countdownIndex+1) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + i;
        }
    }
}
