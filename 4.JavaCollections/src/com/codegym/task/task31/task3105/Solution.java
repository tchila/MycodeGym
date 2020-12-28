package com.codegym.task.task31.task3105;

import javax.xml.namespace.QName;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Adding a file to an archive

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ZipInputStream zipInputStream =  new ZipInputStream(new FileInputStream(args[1]));
        Map<String, byte[]> archived = saveFilesInMap(zipInputStream);
        zipInputStream.close();
        ZipOutputStream zipOutputStream =  new ZipOutputStream(new FileOutputStream(args[1]));
        addFileToArchive(args[0], zipOutputStream);
        addByteArraysToArchive(archived,zipOutputStream);
        zipOutputStream.close();
    }

    public static Map<String, byte[]> saveFilesInMap(ZipInputStream zipInputStream) throws IOException {
        Map<String, byte[]> archiveContents = new HashMap<>();
        ZipEntry zipEntry;
        while ((zipEntry = zipInputStream.getNextEntry())!= null){
            int len;
            byte[] buffer = new byte[1024];
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            while ((len = zipInputStream.read(buffer))!=-1){
                baos.write(buffer,0,len);
            }
            archiveContents.put(zipEntry.getName(),baos.toByteArray());
            baos.close();
        }
        return archiveContents;
    }

    public static void addByteArraysToArchive(Map<String, byte[]> bytesArrays, ZipOutputStream zipOutputStream){
        for (Map.Entry<String, byte[]> stringEntry : bytesArrays.entrySet()) {
            String name = stringEntry.getKey();
            byte[] bytes = stringEntry.getValue();
            try {
                ZipEntry zipEntry = new ZipEntry(name);
                zipEntry.setSize(bytes.length);
                zipOutputStream.putNextEntry(zipEntry);
                zipOutputStream.write(bytes);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void addFileToArchive(String fileToBeAdded, ZipOutputStream zipOutputStream){
        try {
            zipOutputStream.putNextEntry(new ZipEntry("new/" + Paths.get(fileToBeAdded).getFileName()));
            Files.copy(Paths.get(fileToBeAdded),zipOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
