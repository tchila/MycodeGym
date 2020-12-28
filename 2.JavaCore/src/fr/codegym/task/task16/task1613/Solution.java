package fr.codegym.task.task16.task1613;

/* 
Big Ben
*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("Londres", 23, 59, 57);
        Thread.sleep(4000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTime() throws InterruptedException {
            //écris ton code ici
            seconds++;
            if (seconds > 59) {
                seconds = 0;
                minutes++;
                if (minutes > 59) {
                    minutes = 0;
                    hours++;
                    if (hours > 23) {
                        hours = 0;
                    }
                }
            }
            if (hours == 0 && minutes == 0 && seconds == 0) {
                System.out.println(String.format("Il est actuellement minuit à %s !", cityName));
            } else {
                System.out.println(String.format("À %s, l'heure est actuellement %02d:%02d:%02d !", cityName, hours, minutes, seconds));
            }
            Thread.sleep(1000);
        }
    }
}

