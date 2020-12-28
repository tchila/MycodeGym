package fr.codegym.task.task04.task0413;

/* 
Jour de la semaine
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n <1 || n >7){
            System.out.println("Ce jour de la semaine n'existe pas");
        }else{
            if(n == 1)
                System.out.println("Lundi");
            else if(n == 2)
                System.out.println("Mardi");
            else if(n == 3)
                System.out.println("Mercredi");
            else if(n == 4)
                System.out.println("Jeudi");
            else if(n == 5)
                System.out.println("Vendredi");
            else if(n == 6)
                System.out.println("Samedi");
            else
                System.out.println("Dimanche");
        }
    }
}