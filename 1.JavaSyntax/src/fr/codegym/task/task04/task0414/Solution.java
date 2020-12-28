package fr.codegym.task.task04.task0414;

/* 
Nombre de jours dans l’année
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if ( (n % 400) == 0)
            System.out.println("Nombre de jours dans l'année : " + 366);
        else if((n % 100) == 0)
            System.out.println("Nombre de jours dans l'année : " + 365);
        else if ((n % 4)== 0)
            System.out.println("Nombre de jours dans l'année : " + 366);
        else
            System.out.println("Nombre de jours dans l'année : " + 365);

    }
}