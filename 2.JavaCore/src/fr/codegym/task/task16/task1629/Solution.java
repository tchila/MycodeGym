package fr.codegym.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //écris ton code ici

        t1.start();
        t2.start();
        t1.join();
        t2.join();


        t1.printResult();
        t2.printResult();
    }

    //écris ton code ici
    public static class Read3Strings extends Thread {
        private int count = 3;
        private String s="";

        @Override
        public void run() {
            while (count > 0) {
                try {
                    s +=  reader.readLine()+" " ;
                } catch (IOException e) {

                }
                count--;
            }


        }

        public void printResult() {
            System.out.println(s);
        }
    }
}
