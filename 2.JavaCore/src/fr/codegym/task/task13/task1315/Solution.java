package fr.codegym.task.task13.task1315;

/* 
Tom, Jerry et Spike
*/

import java.awt.*;

public class Solution {
    public static void main(String[] args) {

    }

    // Peut se déplacer
    public interface CanMove {
        void move();
    }

    // Peut être mangé
    public interface Edible {
        void beEaten();
    }

    // Peut manger
    public interface CanEat {
        void eat();
    }

    public static class Dog implements CanMove, CanEat{
        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public static class Cat implements CanMove, CanEat, Edible{
        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }

        @Override
        public void eat() {

        }
    }

    public static class Mouse implements CanMove, Edible {
        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }
    }
}