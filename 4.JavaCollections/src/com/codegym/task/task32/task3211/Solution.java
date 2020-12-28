package com.codegym.task.task32.task3211;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;

/* 
Data integrity

*/

public class Solution {
    public static void main(String... args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(new String("test string"));
        oos.flush();
        System.out.println(compareMD5(bos, "5a47d12a2e3f9fecf2d9ba1fd98152eb")); // true

    }

    public static boolean compareMD5(ByteArrayOutputStream byteArrayOutputStream, String md5) throws Exception {

        MessageDigest messageDigest = MessageDigest.getInstance("MD5");

        byte[] message = messageDigest.digest(byteArrayOutputStream.toByteArray());

        StringBuilder sb = new StringBuilder();
        for (byte b : message) {
            //The if-clause (hex.length() == 1) basically checks whether the hex string has only one digit.
            //If that's the case, a 0 is added as a "padding" at the front of the hex string.
            //For example:
            //hex = 3 then 03 is written
            //hex = 8 then 08 is written
            //hex = c then 0c is written
            //This ensures that the hex number consists of at least two digits.
            sb.append(String.format("%02x", b));
        }

        return sb.toString().equals(md5);
    }
}
