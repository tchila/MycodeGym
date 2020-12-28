package com.codegym.task.task30.task3003;

import java.util.concurrent.TransferQueue;

public class Producer implements Runnable {
    private TransferQueue<SharedItem> queue;

    public Producer(TransferQueue<SharedItem> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

            for (int i = 1; i <= 9; i++) {
                System.out.println(System.out.format("'SharedItem-%d' added", i));
                queue.offer(new SharedItem("SharedItem-N", i));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    break;
                }
                if (queue.hasWaitingConsumer())
                     System.out.format("Consumer is waiting!");
            }

    }
}
