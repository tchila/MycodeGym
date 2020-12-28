package com.codegym.task.task27.task2712;

import java.util.ArrayList;
import java.util.List;

public class RandomOrderGeneratorTask implements Runnable {
    List<Tablet> tablets = new ArrayList<>();
    private int sleepTime;

    public RandomOrderGeneratorTask(List<Tablet> tablets, int sleepTime) {
        this.tablets = tablets;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        Tablet tablet = tablets.get((int) Math.random()* tablets.size());
        while (true){
            try {
                Thread.sleep(sleepTime);
                tablet.createOrder();
            } catch (InterruptedException e) {

            }
        }
    }
}
