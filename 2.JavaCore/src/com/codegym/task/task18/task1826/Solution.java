package com.codegym.task.task18.task1826;

/* 
Encryption

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        byte[] key ="123456".getBytes();
        File inFile = new File(args[1]);
        File outFilem = new File(args[2]);
        switch (args[0]) {
            case "-e": {
                FileInputStream src = new FileInputStream(args[1]);
                FileOutputStream dst = new FileOutputStream(args[2]);

                while (src.available() > 0) {
                    byte[] buf = new byte[src.available()];
                    src.read(buf);

                    //XOR Code
                    int j = 0;
                    for (int i = 0; i < buf.length; i++) {
                        buf[i] = (byte) (buf[i] ^ key[j]);
                        if (j > key.length)
                            j = 0;
                    }
                    dst.write(buf);
                }
                src.close();
                dst.close();
                break;
            }
            case "-d": {
                FileInputStream src = new FileInputStream(args[1]);
                FileOutputStream dst = new FileOutputStream(args[2]);

                while (src.available() > 0) {
                    byte[] buf = new byte[src.available()];
                    src.read(buf);

                    //XOR Code
                    int j = 0;
                    for (int i = 0; i < buf.length; i++) {
                        buf[i] = (byte) (buf[i] ^ key[j]);
                        if (j > key.length)
                            j = 0;
                    }
                    dst.write(buf);
                }
                src.close();
                dst.close();
                break;

            }
        }
    }

    public static void encrypt(File inFile, File outFilem, byte[] key) throws IOException {

    }

}
