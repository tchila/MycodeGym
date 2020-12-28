package com.codegym.task.task18.task1824;

/* 
Files and exceptions

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        FileInputStream in = null;
        while (true) {
            try {
                s = bufferedReader.readLine();
                in = new FileInputStream(s);
                in.close();
            } catch (FileNotFoundException e) {
                System.out.println(s);
                bufferedReader.close();
                return;
            }
        }

    }
}
