package fr.codegym.task.task04.task0412;

/* 
Nombres positifs et négatifs
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
            if(i > 0)
                System.out.println(i*2);
            else if(i <0)
                System.out.println(i+1);
            else
                System.out.println(0);



    }

}