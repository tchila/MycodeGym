package com.codegym.task.task18.task1824;


import java.io.*;

/* 
Files and exceptions

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String fileName = reader.readLine();
            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {

            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            }
        }
    }
}
