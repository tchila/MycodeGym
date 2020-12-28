package fr.codegym.task.task18.task1801;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Octet maximum
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int max = 0;
        FileInputStream in =   new FileInputStream(s);
        while (in.available()>0){
            int i = in.read();
            if(i>max)
                max=i;
        }
        System.out.println(max);
        in.close();
        scanner.close();

    }
}
