package fr.codegym.task.task16.task1618;

/* 
Une autre interruption
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //écris ton code ici
        TestThread testThread = new TestThread();
        testThread.start();
        testThread.interrupt();
    }

    //écris ton code ici
    public static class TestThread extends Thread {

        @Override
        public void run() {
            super.run();
        }
    }
}