package fr.codegym.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Une liste et des threads
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {
        //écris ton code ici
        SpecialThread specialThread = new SpecialThread();
        SpecialThread specialThread1 = new SpecialThread();
        SpecialThread specialThread2 = new SpecialThread();
        SpecialThread specialThread3 = new SpecialThread();
        SpecialThread specialThread4 = new SpecialThread();

        Thread thread1 =  new Thread(specialThread);
        Thread thread2 =  new Thread(specialThread1);
        Thread thread3=  new Thread(specialThread2);
        Thread thread4 =  new Thread(specialThread3);
        Thread thread5 =  new Thread(specialThread4);

        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
        list.add(thread5);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("Ceci est la méthode run à l'intérieur de SpecialThread");
        }
    }
}
