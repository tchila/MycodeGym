package com.codegym.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Using RandomAccessFile

*/

public class Solution {
    public static void main(String... args) throws IOException {
        String fileName = args[0];
        int number  = Integer.parseInt(args[1]);
        String text = args[2];
        int length = text.length();

        byte[] buffer = new byte[length];

        RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
        raf.seek(number);
        raf.read(buffer, 0, length);
        String line = new String(buffer);
        raf.seek(raf.length());

        if(text.equals(line)) {
           raf.write("true".getBytes());
        }else {
            raf.write("false".getBytes());

        }
        raf.close();
    }
}