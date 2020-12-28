package com.codegym.task.task27.task2709;

public class TransferObject {
    private int value;
    protected volatile boolean isValuePresent = false; //use this variable

    public synchronized int get() {
        System.out.println("Got: " + value);
        while (!isValuePresent) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isValuePresent = false;
        this.notifyAll();
        return value;
    }

    public synchronized void put(int value) {
       while (isValuePresent){
           try {
               this.wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
        this.value = value;
       isValuePresent = true;
        this.notifyAll();
        System.out.println("Put: " + value);
    }
}
