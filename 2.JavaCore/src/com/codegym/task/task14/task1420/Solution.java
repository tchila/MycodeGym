package com.codegym.task.task14.task1420;

/* 
GCD

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a<= 0 || b<=0)
            throw new Exception();

        int max = Math.max(a, b);
        for (int i = max; i >0 ; i--) {
            if(a%i ==0  && b%i==0){
                System.out.println(i);
                break;
            }

        }
    }
}
