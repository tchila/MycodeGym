package fr.codegym.task.task14.task1412;

/* 
Implémente la méthode printMainInfo
*/

public class Solution {
    public static void main(String[] args) {
        Object obj = new Circle();
        Movable movable = (Movable) obj;
        Drawable drawable = new Rectangle();

        printMainInfo(drawable);
        printMainInfo(movable);
    }

    public static void printMainInfo(Object object) {

        if(object instanceof Drawable)
            ((Drawable) object).draw();
        else if (object instanceof Movable)
            ((Movable) object).move();
        //écris ton code ici
    }

    static interface Movable {

        void move();
    }

    static class Circle implements Movable {

        public void draw() {
            System.out.println("Peut être dessiné");
        }

        public void move() {
            System.out.println("Peut être déplacé");
        }

    }

    static interface Drawable {
        void draw();
    }

    static class Rectangle implements Drawable {
        public void draw() {
            System.out.println("Peut être dessiné");
        }

        public void move() {
            System.out.println("Peut être déplacé");
        }
    }
}