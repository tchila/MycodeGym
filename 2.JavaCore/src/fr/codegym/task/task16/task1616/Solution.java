package fr.codegym.task.task16.task1616;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Comptage de secondes
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        // Créer et exécuter un thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        // Lire une chaîne
        reader.readLine();
        stopwatch.interrupt();
        // Fermer les flux
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            try {
                //écris ton code ici
                while (!isInterrupted()){
                    seconds++;
                    Thread.sleep(1000);
                }
                if(isInterrupted())
                    System.out.println(seconds);
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}
