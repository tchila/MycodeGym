package fr.codegym.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Amélioration de fonctionnalité
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(lecteur.readLine());
        int b = Integer.parseInt(lecteur.readLine());
        int c = Integer.parseInt(lecteur.readLine());
        int d = Integer.parseInt(lecteur.readLine());
        int e = Integer.parseInt(lecteur.readLine());

        int minimum = min(a, b, c, d ,e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b) {
        return a <= b ? a : b;
    }
    public static int min(int a, int b,int c, int d,int e) {
        return min(min((min(a,b)),(min(c,d))),e);
    }
}
