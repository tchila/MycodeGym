package com.codegym.task.task31.task3101;

import java.io.*;
import java.util.*;

/*
Iterating through a file tree

*/
public class Solution {
    List<File> filesSorted = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        String path = args[0];
        String resultFileAbsolutePath = args[1];
        File fileToRename = new File(resultFileAbsolutePath);

        File mergeFile = new File(fileToRename.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(fileToRename, mergeFile);

        FileOutputStream writer = new FileOutputStream(mergeFile);

        List<File> files = new Solution().visitFile(new File(path).listFiles());
        // File mergeFile = new File(args[0]+"/") ;

        for (File file : files) {
            FileInputStream in = new FileInputStream(file);
            byte[] bytes = new byte[in.available()];
            in.read(bytes);
            writer.write(bytes);
            writer.write('\n');
            in.close();
        }
        writer.close();

    }

    public List<File> visitFile(File[] files) {
        Arrays.stream(files).forEach(this::accept);
        filesSorted.sort(Comparator.comparing(File::getName));
        return filesSorted;
    }

    private void accept(File file) {
        if (file.isDirectory()) {
            visitFile(file.listFiles());
        } else {
            if (file.length() <= 50)
                filesSorted.add(file);
        }
    }
}