package fr.codegym.task.task16.task1621;

/* 
Thread.currentThread renvoie toujours le thread actuel
*/

public class Solution {
    static int count = 5;

    public static void main(String[] args) {
        ThreadNamePrinter tnp = new ThreadNamePrinter();
        tnp.start();
        for (int i = 0; i < count; i++) {
            tnp.printMsg();
        }
    }

    public static class ThreadNamePrinter extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                printMsg();
            }
        }

        public void printMsg() {
            Thread t = Thread.currentThread(); // Le thread actuel doit être affecté à la variable t
            String name = t.getName();
            System.out.println("Nom = " + name);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Ajouter sleep ici
        }
    }
}
