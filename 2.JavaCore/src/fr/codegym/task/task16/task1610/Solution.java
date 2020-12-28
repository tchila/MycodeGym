package fr.codegym.task.task16.task1610;

/* 
Organiser les appels à join()
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Missy");
        Cat cat2 = new Cat("Coco");
    }

    private static void investigateWorld() {

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class Cat extends Thread {
        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) {
            super(name);
            kitten1 = new Kitten("Le chaton 1 (mère - " + getName() + ")");
            kitten2 = new Kitten("Le chaton 2 (mère - " + getName() + ")");
            start();
        }

        public void run() {
            System.out.println(getName() + " a donné naissance à 2 chatons");
            try {
                initAllKittens();
            } catch (InterruptedException e) {
            }
            System.out.println(getName() + ": Tous les chatons sont dans le panier. " + getName() + " les a ramenés");
        }

        private void initAllKittens() throws InterruptedException {
            kitten1.start();
            kitten1.join();
            kitten2.start();
            kitten2.join();
        }
    }

    public static class Kitten extends Thread {
        public Kitten(String name) {
            super(name);
        }

        public void run() {
            System.out.println(getName() + " n'est plus dans le panier");
            investigateWorld();
        }
    }
}
