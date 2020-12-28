package com.codegym.task.task27.task2712;

import com.codegym.task.task27.task2712.ad.AdvertisementManager;
import com.codegym.task.task27.task2712.ad.NoVideoAvailableException;
import com.codegym.task.task27.task2712.kitchen.Order;
import com.codegym.task.task27.task2712.kitchen.TestOrder;

import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablet  {
    private  static Logger logger = Logger.getLogger(Tablet.class.getName());
    private final int number;
    private LinkedBlockingQueue<Order> queue;

    public void setQueue(LinkedBlockingQueue<Order> queue) {
        this.queue = queue;
    }

    public Tablet(int number) {
        this.number = number;
    }

    public Order createOrder(){
        Order order = null;
        AdvertisementManager advertisementManager = null;
        try {
            order = new Order(this);
            insideOrder(order);
        } catch (NoVideoAvailableException e) {
            logger.log(Level.INFO,"No video is available for the order " + order);
        } catch (IOException e) {
            logger.log(Level.SEVERE,"Console is unavailable.");
        }
        return order;
    }

    private void insideOrder(Order order) {
        AdvertisementManager advertisementManager;
        if (!order.isEmpty()) {
            ConsoleHelper.writeMessage(order.toString());
            advertisementManager = new AdvertisementManager(order.getTotalCookingTime() * 60);
            advertisementManager.processVideos();
            queue.add(order);
           /* setChanged();
            notifyObservers(order);*/
        }
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }

    public void createTestOrder(){
        Order order = null;
        AdvertisementManager advertisementManager = null;
        try {
            order = new TestOrder(this);
            insideOrder(order);
        }  catch (IOException e) {
            logger.log(Level.SEVERE,"Console is unavailable.");
            return;
        }
    }


}
