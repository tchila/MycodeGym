package com.codegym.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

/* 
What's in the folder?

*/
public class Solution extends SimpleFileVisitor<Path> {
    public static int fileCount = 0;
    public static int dirCount = 0;
    public static long totalSize = 0;

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(Files.isRegularFile(file)){
            fileCount++;
            totalSize+=attrs.size();
        }

        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        dirCount++;
        return super.postVisitDirectory(dir, exc);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        bufferedReader.close();

        Path path = Paths.get(s);
        if(Files.isDirectory(path)) {
            Files.walkFileTree(path,new Solution());
            System.out.println("Total folders: " + (dirCount -1));
            System.out.println("Total files: " + fileCount);
            System.out.println("Total size: " + totalSize);

        }else{
            System.out.println(path.toString() + " is not a folder");
            return;
        }
    }
}
