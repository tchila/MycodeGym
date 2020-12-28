package fr.codegym.task.task18.task1816;

/* 
ABC
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int i, count = 0;
        while ((i=fileInputStream.read())!=-1){
            char c =(char)i;
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
                count++;
        }
        System.out.println(count);
        fileInputStream.close();
    }
}
