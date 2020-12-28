package com.codegym.task.task31.task3109;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/* 
Reading config files

*/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Properties properties = solution.getProperties("4.JavaCollections/src/com/codegym/task/task31/task3109/properties.xml");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/codegym/task/task31/task3109/properties.txt");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/codegym/task/task31/task3109/notExists");
        properties.list(System.out);
    }

    public Properties getProperties(String fileName) {

        File file  = new File(fileName);
        Properties properties = new Properties();
        try {
            if(fileName.endsWith(".xml")){
                properties.loadFromXML(new FileInputStream(fileName));
            }else {
                properties.load(new FileReader(file));
            }
        } catch (IOException e) {
            properties = new  Properties();
        }

        return properties;
    }
}
