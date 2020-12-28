package fr.codegym.task.task16.task1602;

/* 
Mon deuxième thread
*/

public class Solution {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }

    public static class TestThread extends Thread {

        static {
            System.out.println("Ceci est le bloc statique à l'intérieur de TestThread");
        }
        @Override
        public void run() {
            System.out.println("Ceci est la méthode run");
        }
    }
}
