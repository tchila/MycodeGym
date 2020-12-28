package com.codegym.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/* 
Changing the encoding

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]), "Windows-1251"));
        BufferedWriter outputStream = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1]), "UTF-8"));
        String line ;
        while ((line = bufferedReader.readLine())!= null){
            outputStream.write(line);
        }
       bufferedReader.close();
        outputStream.close();

    }
}
