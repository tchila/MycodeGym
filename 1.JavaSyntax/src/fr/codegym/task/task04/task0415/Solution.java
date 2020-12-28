package fr.codegym.task.task04.task0415;

/* 
La règle du triangle
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a >= (b + c))
            System.out.println("Le triangle n'est pas possible.");
        else if (b >=(a+c))
            System.out.println("Le triangle n'est pas possible.");
        else if(c >= (a+b))
            System.out.println("Le triangle n'est pas possible.");
        else
            System.out.println(" Le triangle est possible.");

    }
}