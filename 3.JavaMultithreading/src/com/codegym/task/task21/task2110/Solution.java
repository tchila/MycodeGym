package com.codegym.task.task21.task2110;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* 
Refactoring methods

*/
public class Solution {
    public static void writeZipEntriesToFile(String zipFileName, String outputFileName) {
        Charset charset = StandardCharsets.UTF_8;
        Path outputFilePath = Paths.get(outputFileName);
        String newLine = System.getProperty("line.separator");

        try (BufferedWriter writer =  Files.newBufferedWriter(outputFilePath, charset);ZipFile zip =  new ZipFile(zipFileName)){

            for (Enumeration entries = zip.entries(); entries.hasMoreElements(); ) {
                // Get the file name from the archive and write it to the output file
                String zipEntryName = ((ZipEntry) entries.nextElement()).getName() + newLine;
                writer.write(zipEntryName, 0, zipEntryName.length());
            }
        }  catch (IOException e) {
        e.printStackTrace();
    }

    }

    public static void main(String[] args) {

    }
}
