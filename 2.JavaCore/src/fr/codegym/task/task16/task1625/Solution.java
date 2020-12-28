package fr.codegym.task.task16.task1625;

/* 
Interblocage
*/

public class Solution {
    static Thread t1 = new T1();
    static Thread t2 = new T2();

    public static void main(String[] args) throws InterruptedException {
        t1.start();
        t2.start();
        t1.interrupt();

    }

    public static class T1 extends Thread {
        @Override
        public void run() {
            try {
                t2.join();
                System.out.println("T1 s'est terminé");
            } catch (InterruptedException e) {
                System.out.println("T1 a été interrompu");
            }
        }
    }

    public static class T2 extends Thread {
        @Override
        public void run() {
            try {
                t1.join();

                System.out.println("T2 s'est terminé");
            } catch (InterruptedException e) {
                System.out.println("T2 a été interrompu");
            }
        }
    }
}

