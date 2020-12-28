package com.codegym.task.task32.task3204;

import java.io.*;
import java.util.Random;

/* 
Password generator

*/
public class Solution {
    static String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String chars = "abcdefghijklmnopqrstuvwxyz";
    static String nums = "0123456789";
    static String passSymbols = charsCaps + chars + nums ;
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword()  {
        Random rnd = new Random();
        char[] passWd = new char[8];
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        for (int i = 0; i < 8; i++) {
            passWd[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
        }
        String s = new String(passWd);
        if(s.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$")){
            InputStream inputStream = new ByteArrayInputStream(s.getBytes());
                try {
                    while (inputStream.available()>0) {
                        outputStream.write(inputStream.read());
                    }
                    return outputStream;
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
            return getPassword();


    }
}