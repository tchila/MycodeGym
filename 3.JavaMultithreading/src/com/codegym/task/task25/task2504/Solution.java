package com.codegym.task.task25.task2504;

import javafx.concurrent.Worker;

/*
A switch for threads

*/
public class Solution {
    public static void processThreads(Thread... threads) {
        // Implement this method

        for (Thread thread : threads) {
            switch (thread.getState()) {
                case NEW:
                    thread.start();
                    break;
                case TIMED_WAITING:
                case WAITING:
                case BLOCKED:
                    thread.interrupt();
                    break;
                case RUNNABLE:
                    thread.isInterrupted();
                    break;
                case TERMINATED:
                    System.out.println(thread.getPriority());
                    break;
                default:
                    break;


            }

        }
    }

    public static void main(String[] args) {
    }
}
