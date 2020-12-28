package fr.codegym.task.task18.task1807;

/* 
Comptage des virgules
*/

import java.io.FileInputStream;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        FileInputStream in = new FileInputStream(s) ;
        int count = 0;
        while ((in.available()>0)) {
            int c = in.read();
            if(c == ',')
                count++;
        }
        System.out.println(count);
        scanner.close();
        in.close();
    }
}
