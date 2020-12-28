package fr.codegym.task.task03.task0304;

/* 
Mission avec des pourcentages
*/

public class Solution {
    public static double ajouterDixPourCent(int i) {
        //écris ton code ici
        return i + (i*10.0/100);
    }

    public static void main(String[] args) {
        System.out.println(ajouterDixPourCent(9));
    }
}
