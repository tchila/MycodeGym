package fr.codegym.task.task19.task1927;

/* 
Publicité contextuelle
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
        String result = outputStream.toString();
        String output = "";
        int count = 0;
        String[] strings = result.split("\n");
        for (String string : strings) {
            count++;
            output+=string+"\n";
            if(count%2 == 0)
                output+="CodeGym - Cours de Java en ligne\n";

        }

        System.setOut(printStream);

        System.out.println(output);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("première");
            System.out.println("deuxième");
            System.out.println("troisième");
            System.out.println("quatrième");
            System.out.println("cinquième");
        }
    }
}
