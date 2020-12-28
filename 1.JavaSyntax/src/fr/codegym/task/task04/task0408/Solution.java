package fr.codegym.task.task04.task0408;

/* 
Bonne ou mauvaise note ?
*/

public class Solution {
    public static void main(String[] args) {
        comparer(3);
        comparer(6);
        comparer(5);
    }

    public static void comparer(int a) {
        //écris ton code ici
        if (a<5){
            System.out.println("Le nombre est inférieur à 5");
        }else if(a == 5){
            System.out.println("Le nombre est égal à 5 ");
        }else{
            System.out.println("Le nombre est supérieur à 5" );
        }
    }
}