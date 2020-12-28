package fr.codegym.task.task05.task0521;

/* 
Appel d'un constructeur à partir d'un constructeur
*/

public class Cercle {

    public double x;
    public double y;
    public double rayon;

    public Cercle(double x, double y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public Cercle(double x, double y) {
        this(x, y, 10);
    }

    public Cercle() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Cercle cercle = new Cercle();
        System.out.println(cercle.x + " " + cercle.y + " " + cercle.rayon);
        Cercle autreCercle = new Cercle(10, 5);
        System.out.println(autreCercle.x + " " + autreCercle.y + " " + autreCercle.rayon);
    }
}
