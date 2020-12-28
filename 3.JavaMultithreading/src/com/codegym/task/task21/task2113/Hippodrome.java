package com.codegym.task.task21.task2113;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hippodrome {
    private static List<Horse> horses = new ArrayList<>();
    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public Hippodrome() {
    }

    public static void main(String[] args) throws InterruptedException {
        //List<Horse> horses = new ArrayList<>();
        horses.add(new Horse("horse",3,0));
        horses.add(new Horse("horse1",3,0));
        horses.add(new Horse("horse2",3,0));
        game = new Hippodrome();
        game.run();
        game.printWinner();


    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move(){
        for (Horse hors : horses) {
            hors.move();
        }
    }

    public void print(){
            for (Horse hors : horses) {
                hors.print();
            }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        horses.sort((o1, o2) -> Double.compare(o1.getDistance(),o2.getDistance()));
        return horses.get(horses.size()-1);
    }
    public void printWinner(){
        System.out.println("The winner is " +getWinner().getName()+"!");
    }
}
