package fr.codegym.task.task19.task1911;

/* 
Wrapper lecteur
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream printStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);

        testString.printSomething();
        String result = outputStream.toString().toUpperCase();

        System.setOut(printStream);

        System.out.println(result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("Ce texte est à des fins de test");
        }
    }
}
