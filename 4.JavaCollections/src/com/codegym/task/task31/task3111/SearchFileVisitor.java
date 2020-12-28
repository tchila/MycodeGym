package com.codegym.task.task31.task3111;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private List<Path> foundFiles = new ArrayList<>();
    private String partOfName =" ", partOfContent = " ";
    private int maxSize = -1 ,minSize = -1;
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file); // File size: content.length

        if(findByContent(content) && findByName(file) && findByMaxSize(content) && findByMinSize(content))
            foundFiles.add(file);

        return super.visitFile(file, attrs);
    }

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<Path> getFoundFiles() {
        return foundFiles;
    }

    public void setFoundFiles(List<Path> foundFiles) {
        this.foundFiles = foundFiles;
    }

    private boolean findByName(Path file){
        if(partOfName == " ")
            return true;
        else
            return file.getFileName().toString().contains(partOfName);

    }

    private boolean findByContent(byte[] content) throws   UnsupportedEncodingException {
        if(partOfContent == " ")
            return true;
        else{
            String contentCopie=  new String(content, StandardCharsets.UTF_8) ;
            return  contentCopie.contains(partOfContent);
        }
    }

    private boolean findByMaxSize(byte[] content){
        if(maxSize == -1)
            return true;
        else{
            return content.length < maxSize;
        }
    }

    private boolean findByMinSize(byte[] content){
        if(minSize == -1)
            return true;
        else{
            return content.length > minSize;
        }
    }
}
