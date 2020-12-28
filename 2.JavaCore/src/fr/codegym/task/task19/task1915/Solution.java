package fr.codegym.task.task19.task1915;

/* 
Texte dupliqué
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fichier1 = bufferedReader.readLine();
        bufferedReader.close();

        PrintStream printStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);

        testString.printSomething();
        String result = outputStream.toString();

        FileOutputStream fileOutputStream = new FileOutputStream(fichier1);
        fileOutputStream.write(result.getBytes());
        fileOutputStream.close();
        System.setOut(printStream);

        System.out.println(result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("Ce texte est à des fins de test");
        }
    }
}

