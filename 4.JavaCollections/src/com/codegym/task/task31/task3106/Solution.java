package com.codegym.task.task31.task3106;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/*
Unzipping a file

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String resultFile = args[0];
        List<String> inFiles = new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            inFiles.add(args[i]);
        }
        Collections.sort(inFiles);

        List<FileInputStream> files = new ArrayList<>();
        for (String s: inFiles) {
            files.add(new FileInputStream(s));
        }



        ZipInputStream zipInputStream = new ZipInputStream(new SequenceInputStream(Collections.enumeration(files)));
        BufferedOutputStream os  =  new BufferedOutputStream(new FileOutputStream(resultFile));
        for (ZipEntry entry = null; (entry = zipInputStream.getNextEntry()) != null;  ) {
            byte[] buffer =new byte[1024];
            int length;
            while ((length = zipInputStream.read(buffer))!=-1){
                os.write(buffer,0,length);
            }
            os.flush();
        }
        zipInputStream.close();
        os.close();
    }
}
