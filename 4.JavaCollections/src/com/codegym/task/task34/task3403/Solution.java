package com.codegym.task.task34.task3403;

/* 
Factorization using recursion

*/
public class Solution {
    public void recurse(int n) {
        int factor  = 2;
        if(n<2)
            return;
        while (n%factor  != 0) factor++;
        System.out.print( factor + " ");
        recurse(n/factor);
    }
}