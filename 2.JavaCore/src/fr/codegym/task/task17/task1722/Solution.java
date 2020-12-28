package fr.codegym.task.task17.task1722;

/* 
Comptons
*/

import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();

        counter1.start();
        counter2.start();
        counter3.start();
        counter4.start();


        counter1.join();
        counter2.join();
        counter3.join();
        counter4.join();


        if (IntStream.rangeClosed(1, 100).anyMatch(i -> values[i] != 1)) {
            System.out.println("Le tableau values contient des éléments non égaux à 1");
        }
    }

    public static Integer count = 0;
    public static int[] values = new int[105];

    static {
        for (int i = 0; i < 105; i++) {
            values[i] = 0;
        }
    }

    public static void incrementCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static class Counter extends Thread {
        @Override
        public void run() {
            do {
                synchronized (Solution.class) {
                    incrementCount();
                    values[getCount()]++;
                }

                try {
                    Thread.sleep(1);
                } catch (InterruptedException ignored) {
                }
            } while (getCount() < 100);
        }
    }
}
