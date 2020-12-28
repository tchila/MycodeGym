package fr.codegym.task.task18.task1802;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Plus petit octet
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        FileInputStream in =   new FileInputStream(s);
        byte[] eight = new byte[8];
        int min = in.read();
        while (in.available()>0){
            int i = in.read();
            if(i<min)
                min=i;
        }
        System.out.println(min);
        in.close();
        scanner.close();

    }
}
