package com.codegym.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;

public class Producer implements Runnable{
    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    private ConcurrentHashMap<String, String> map;
    @Override
    public void run() {
        try {
            int i = 0;
            while (true) {
                map.put(String.valueOf(++i),  "Some text for "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(String.format("[%s] thread was terminated", Thread.currentThread().getName()));

        }
    }
}
