package fr.codegym.task.task05.task0522;

/* 
Le maximum de constructeurs
*/

public class Cercle {
    public double x;
    public double y;
    public double rayon;

    //écris ton code ici


    public Cercle() {

    } public Cercle(double x) {
        this.x = x;
    }

    public Cercle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Cercle(double x, double y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public static void main(String[] args) {

    }
}