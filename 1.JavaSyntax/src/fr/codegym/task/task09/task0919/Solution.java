package fr.codegym.task.task09.task0919;

/* 
Division par zéro
*/

public class Solution {

    public static void main(String[] args) {

        try {
            diviserParZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void diviserParZero() {
        int a = 8/0;
        System.out.println(a);
    }
}
