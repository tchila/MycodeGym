package fr.codegym.task.task15.task1510;

/* 
Du vent, tout ce qui n'est pas nécessaire !
*/

public class Solution {
    public static void main(String[] args) {
        add((short) 1, 2f);
        add(1, 2);
        add(2d, 2);
        add((byte) 1, 2d);
    }

    public static void add(int i, int j) {
        System.out.println("Addition d'entiers");
    }

    public static void add(int i, double j) {
        System.out.println("Addition d'un entier et d'un double");
    }

    public static void add(double i, double j) {
        System.out.println("Addition de doubles");
    }
}
