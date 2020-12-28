package com.codegym.task.task30.task3003;

import java.util.concurrent.TransferQueue;

public class Consumer implements Runnable {
    private TransferQueue<SharedItem> queue;

    public Consumer(TransferQueue<SharedItem> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(450);
            while (true){
                SharedItem item = queue.take();
                System.out.println(System.out.format("Processing %s" ,item.toString()));
            }
        } catch (InterruptedException e) {

        }
    }
}
