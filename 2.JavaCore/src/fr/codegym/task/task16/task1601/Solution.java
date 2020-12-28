package fr.codegym.task.task16.task1601;

/* 
Mon premier thread
*/

public class Solution {
    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }

    public static class TestThread implements Runnable {

        @Override
        public void run() {
            System.out.println("Mon premier thread");
        }
    }
}
