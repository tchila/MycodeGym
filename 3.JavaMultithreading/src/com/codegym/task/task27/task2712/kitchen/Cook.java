package com.codegym.task.task27.task2712.kitchen;

import com.codegym.task.task27.task2712.ConsoleHelper;
import com.codegym.task.task27.task2712.Tablet;
import com.codegym.task.task27.task2712.statistics.StatisticsManager;
import com.codegym.task.task27.task2712.statistics.event.OrderReadyEventDataRow;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.LinkedBlockingQueue;

public class Cook extends Observable implements Runnable {

    private String name;
    private boolean busy;

    public void setQueue(LinkedBlockingQueue<Order> queue) {
        this.queue = queue;
    }

    private LinkedBlockingQueue<Order> queue;

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


    public void startCookingOrder(Order order){
        setBusy(true);
        ConsoleHelper.writeMessage("Start cooking - " + order.toString());
        try {
            Thread.sleep(order.getTotalCookingTime()*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        StatisticsManager.getInstance().record(new OrderReadyEventDataRow(order.getTablet().toString(), this.toString(),
                order.getTotalCookingTime() * 60, order.getDishes()));
        setChanged();
        notifyObservers(order);
        setBusy(false);
    }


    @Override
    public void run() {
            while (true){
                try {
                    if(!queue.isEmpty()){
                            if(!isBusy())
                                startCookingOrder(queue.take());

                    }else {
                        Thread.sleep(10);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

}
