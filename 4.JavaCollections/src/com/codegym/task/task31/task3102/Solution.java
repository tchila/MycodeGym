package com.codegym.task.task31.task3102;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Find all the files

*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> result;
        try(Stream<Path> walk = Files.walk(Paths.get(root))){

           result = walk.filter(Files::isRegularFile).
                   map(x -> x.toAbsolutePath().toString()).collect(Collectors.toList());
       }
        return result;
    }

    public static void main(String[] args) throws IOException {
        //System.out.println(getFileTree("D:\\Flickr-Android-Client-master"));
    }
}