package fr.codegym.task.task19.task1913;

/* 
Imprimer uniquement les chiffres
*/

import java.io.ByteArrayInputStream;
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
        String result = outputStream.toString().replaceAll("[^0-9]+", "");

        System.setOut(printStream);

        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("Ce 1 texte 23 est 4 à des f5-6ins7 de tes8t");
        }
    }
}
