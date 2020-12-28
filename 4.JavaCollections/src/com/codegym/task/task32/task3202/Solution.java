package com.codegym.task.task32.task3202;

import java.io.*;

/* 
Reading from a stream

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("testFile.log"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
            StringWriter writer = new StringWriter();
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            writer.write(stringBuilder.toString());
            return writer;
        } catch (Exception E) {
            return new StringWriter();
        }


    }
}