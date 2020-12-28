package fr.codegym.task.task16.task1615;

/* 
Aéroport
*/

public class Solution {
    public static volatile Runway RUNWAY = new Runway();   // 1 piste

    public static void main(String[] args) throws InterruptedException {
        Plane plane1 = new Plane("Plane #1");
        Plane plane2 = new Plane("Plane #2");
        Plane plane3 = new Plane("Plane #3");
    }

    private static void waitForTakeoff() {
        // écris ton code ici
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }

    private static void takeOff() {
        // Corrige cette méthode
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {
        }
    }

    public static class Plane extends Thread {
        public Plane(String name) {
            super(name);
            start();
        }

        public void run() {
            boolean hasAlreadyTakenOff = false;
            while (!hasAlreadyTakenOff) {
                if (RUNWAY.trySetCurrentPlane(this)) {    // si la piste est disponible, nous l'utilisons
                    System.out.println(getName() + " vole");
                    takeOff();// vole
                    System.out.println(getName() + " dans le ciel");
                    hasAlreadyTakenOff = true;
                    RUNWAY.setCurrentPlane(null);
                } else if (!this.equals(RUNWAY.getCurrentPlane())) {  // si la piste est occupée par un avion
                    System.out.println(getName() + " attend");
                    waitForTakeoff(); // attend
                }
            }
        }
    }

    public static class Runway {
        private Thread t;

        public Thread getCurrentPlane() {
            return t;
        }

        public void setCurrentPlane(Thread t) {
            synchronized (this) {
                this.t = t;
            }
        }

        public boolean trySetCurrentPlane(Thread t) {
            synchronized (this) {
                if (this.t == null) {
                    this.t = t;
                    return true;
                }
                return false;
            }
        }
    }
}

