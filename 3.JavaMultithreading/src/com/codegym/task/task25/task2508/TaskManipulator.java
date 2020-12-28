package com.codegym.task.task25.task2508;

public class TaskManipulator implements Runnable, CustomThreadManipulator {
    private Thread thread;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        while (!Thread.currentThread().isInterrupted()){
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName());
            } catch (Exception e) {
                break;
            }
        }

    }

    @Override
    public void start(String threadName) {
        thread = new Thread(this,threadName);
        thread.start();
    }

    @Override
    public void stop() {
        thread.interrupt();
    }
}
