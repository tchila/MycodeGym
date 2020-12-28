package com.codegym.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new InfinitThread("Infinit Threads"));
        threads.add(new InterruptedThread("Interrupted Threads"));
        threads.add(new HouraThread("Houra Threads"));
        threads.add(new MessageThread("Message Threads"));
        threads.add(new NumberSumThread("Infinit Threads"));
    }

    public static void main(String[] args) {
        for (Thread thread : threads) {
            thread.start();
        }
    }

    private static class InfinitThread extends Thread {
        public InfinitThread(String infinit_threads) {
            super(infinit_threads);
        }

        @Override
        public void run() {
            while (true){

            }
        }
    }

    private static class InterruptedThread extends Thread {
        public InterruptedThread(String interrupted_threads) {
            super(interrupted_threads);
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000000000);
            }catch (InterruptedException e){
                System.out.println("InterruptedException");

            }
        }
    }

    private static class HouraThread extends Thread {
        public HouraThread(String houra_threads) {
            super(houra_threads);
        }

        @Override
        public void run() {
           while (true){
               System.out.println("Hurray");
               try {
                   Thread.sleep(500);
               } catch (InterruptedException e) {
               }
           }
        }
    }

    private static class MessageThread extends Thread implements Message{
        private boolean start;
        public MessageThread(String message_threads) {
            super(message_threads);
            this.start = false;
        }

        @Override
        public void run() {
            while (!this.start){

            }
        }


        @Override
        public void showWarning() {
            this.start = true;
        }
    }

    private static class NumberSumThread extends Thread {
        public NumberSumThread(String infinit_threads) {
            super(infinit_threads);
        }

        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int somme =0;
            while (true){
                String s = "";
                try {
                     s = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(s.equals("N"))
                    break;
                somme +=Integer.parseInt(s);
            }
            System.out.println(somme);
        }
    }
}