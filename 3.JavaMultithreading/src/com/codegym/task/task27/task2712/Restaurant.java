package com.codegym.task.task27.task2712;

import com.codegym.task.task27.task2712.kitchen.Cook;
import com.codegym.task.task27.task2712.kitchen.Order;
import com.codegym.task.task27.task2712.kitchen.Waiter;
import com.codegym.task.task27.task2712.statistics.StatisticsManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class Restaurant {
    private static final int ORDER_CREATION_INTERVAL = 100;
    private final static LinkedBlockingQueue<Order> orderQueue = new LinkedBlockingQueue<>();

    public static void main(String[] args ) {

        //Tablet tablet = new Tablet (5);
        Cook cook = new Cook ("Amigo");
        cook.setQueue(orderQueue);
        Cook cook1 = new Cook ("Amigo");
        cook1.setQueue(orderQueue);
       /* OrderManager orderManager = new OrderManager ();
        OrderManager orderManager1 = new OrderManager ();*/
        //StatisticsManager.getInstance().register(cook);
        //StatisticsManager.getInstance().register(cook1);
        Waiter waiter = new Waiter();
        //tablet.addObserver (cook);
        cook.addObserver (waiter);
        cook1.addObserver (waiter);
        //tablet.createOrder ();
        ManagerTablet managerTablet = new ManagerTablet();
        managerTablet.printActiveVideoSet();
        managerTablet.printAdRevenue();
        managerTablet.printArchivedVideoSet();
        managerTablet.printCookUtilization();
        List<Tablet> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Tablet tablet = new Tablet(i);
            tablet.setQueue(orderQueue);
            list.add(tablet);
        }

        Thread cookThread1 = new Thread(cook);
        Thread cookThread2 = new Thread(cook1);
        cookThread1.start();
        cookThread2.start();

        RandomOrderGeneratorTask task = new RandomOrderGeneratorTask(list, ORDER_CREATION_INTERVAL);
        Thread thread = new Thread( task);
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        thread.interrupt();


    }
}
