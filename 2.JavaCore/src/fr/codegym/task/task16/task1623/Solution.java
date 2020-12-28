package fr.codegym.task.task16.task1623;

/* 
Création récursive de threads
*/

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());

    }

    public static class GenerateThread extends Thread {
        public GenerateThread() {
            super(String.valueOf(++createdThreadCount));
            start();
        }

        @Override
        public void run() {
            if (createdThreadCount < count)  {
                System.out.println(new GenerateThread());
            }
        }

        @Override
        public String toString() {
            return getName()+
                    " créé" ;
        }
    }
}
