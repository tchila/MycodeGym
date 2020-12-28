package com.codegym.task.task39.task3912;

/* 
Maximum area

*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int maxSquare(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int h = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i*j == 0)
                    continue;
                if(matrix[i][j] == 1)
                    matrix[i][j] = Math.min(matrix[i][j-1],Math.min(matrix[i-1][j],matrix[i-1][j-1]))+1;

                if(matrix[i][j] > h){
                    h = matrix[i][j];
                }
            }
        }
        return h * h;
    }
}
