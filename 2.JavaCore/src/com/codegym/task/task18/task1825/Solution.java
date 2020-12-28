package com.codegym.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Building a file

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> parts = new ArrayList<>();
        FileInputStream fileInputStream = null;
        String nextFileName = null;

        while (true) {
            if("end".equals(nextFileName = scanner.nextLine()))
                break;
            else
                parts.add(nextFileName);
        }
        scanner.close();
        parts.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        String outFile = parts.get(0).split(".part")[0];
        FileOutputStream fileOutputStream = new FileOutputStream(outFile);
        for (String part : parts) {
            fileInputStream = new FileInputStream(part);
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            fileOutputStream.write(bytes);
            fileInputStream.close();
        }
        fileOutputStream.close();
    }
}
