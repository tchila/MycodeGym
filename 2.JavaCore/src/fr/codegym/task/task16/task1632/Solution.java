package fr.codegym.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        Thread4 t4 = new Thread4();
        Thread5 t5 = new Thread5();
        threads.add(t1);
        threads.add(t2);
        threads.add(t3);
        threads.add(t4);
        threads.add(t5);
    }
    public static void main(String[] args) {
    }

    public static class Thread1 extends Thread{
        @Override
        public void run() {
            while (true){

            }
        }
    }

    public static class Thread2 extends Thread{
        @Override
        public void run() {

                while (true){
                    for (StackTraceElement traceElement:
                            Thread.currentThread().getStackTrace()) {
                        if(traceElement.getClassName().contains("InterruptedException")){
                            System.out.println("InterruptedException" );
                        }

                    }
                    }
                }

        }


    public static class Thread3 extends Thread{
        @Override
        public void run() {
            while (true){
                try {
                    System.out.println("Hourra");
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }

            }
        }
    }


    public static class Thread4 extends Thread implements Message{
        @Override
        public void showWarning() {
            if(Thread.currentThread().isAlive())
                Thread.currentThread().interrupt();
        }

        @Override
        public void run() {
            while (Thread.currentThread().isAlive()){

            }
        }
    }


    public static class Thread5 extends Thread {
        private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        private int somme;
        @Override
        public void run() {
            while (true){
                try {
                    String s = reader.readLine();
                    if ("N".equals(s))break;
                    int n = Integer.parseInt(s);
                    somme+=n;
                } catch (IOException e) {

                }
            }
            System.out.println(somme);
        }
    }


}