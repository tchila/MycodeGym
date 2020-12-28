package com.codegym.task.task32.task3213;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/* 
Caesar cipher

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        System.out.println(decode(reader, -3));  // Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) throws IOException {
        try {
            StringWriter writer = new StringWriter();
            int c;
            while ((c = reader.read()) != -1) {
                writer.write((c + key));
            }
            return writer.toString();
        } catch (Exception e) {
            return " ";
        }
    }

}
