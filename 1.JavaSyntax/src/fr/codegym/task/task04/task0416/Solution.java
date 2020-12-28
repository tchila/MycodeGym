package fr.codegym.task.task04.task0416;

/* 
Traverser les yeux fermés
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scanner = new Scanner(System.in);
        double nombre = scanner.nextDouble();
        double modulo = nombre % 5;
        if(modulo >= 0 && modulo <3)
            System.out.println("vert");
        else if(modulo < 4 && modulo >=3)
            System.out.println("jaune");
        else
            System.out.println("rouge");
    }
}