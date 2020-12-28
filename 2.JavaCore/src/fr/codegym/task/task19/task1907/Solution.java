package fr.codegym.task.task19.task1907;

/* 
Comptage des mots
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();
        bufferedReader.close();
        FileReader reader = new FileReader(file);
        StringBuffer buffer = new StringBuffer();

        while (reader.ready()) {
            buffer.append(Character.toString((char)reader.read()));
        }
        String[] counter = buffer.toString().split("\\bworld\\b");
        System.out.println(counter.length-1);

        reader.close();
    }
}
