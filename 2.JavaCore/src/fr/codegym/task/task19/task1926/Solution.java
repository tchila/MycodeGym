package fr.codegym.task.task19.task1926;

/* 
Reflet
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s  =  bufferedReader.readLine();
        bufferedReader.close();
        String line = "";
        BufferedReader reader = new BufferedReader(new FileReader(s));
        while ((line = reader.readLine()) != null){
           /* char[] chars = line.toCharArray();
            int length =chars.length;
            for (int i = 0; i < length-1; i++) {
                char temp = chars[i];
                chars[i] = chars[length-1-i];
                chars[length-1-i] = temp;
            }*/
            System.out.println(new StringBuilder(line).reverse().toString());
        }
        reader.close();

    }
}
