package fr.codegym.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Présentation de .properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        // Implémente cette méthode
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream inputStream = new FileInputStream(s);
        load(inputStream);

    }

    public void save(OutputStream outputStream) throws Exception {
        // Implémente cette méthode
        PrintWriter printWriter = new PrintWriter(outputStream);
        for (Map.Entry<String, String> stringStringEntry : properties.entrySet()) {
            printWriter.println(stringStringEntry.getKey() + "="+stringStringEntry.getValue());
        }
        printWriter.flush();

    }

    public void load(InputStream inputStream) throws Exception {
        // Implémente cette méthode
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String proprietes;
        while ((proprietes = reader.readLine()) != null){
            properties.put(proprietes.split("=")[0],proprietes.split("=")[1]);
        }
    }

    public static void main(String[] args) {

    }
}
