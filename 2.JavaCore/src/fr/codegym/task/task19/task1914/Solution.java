package fr.codegym.task.task19.task1914;

/* 
Résolution de problèmes
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
        String operation = outputStream.toString().split("=")[0].trim();
        String[] donnes = operation.split(" ");
        String a = donnes[0];
        String signe = donnes[1];
        String b = donnes[2];

        int result = 0;

        if(signe.equals("+")){
            result = Integer.parseInt(a) + Integer.parseInt(b);
        }
        else if(signe.equals("-")){
            result = Integer.parseInt(a) - Integer.parseInt(b);
        }else{
            result = Integer.parseInt(a) * Integer.parseInt(b);
        }

        String output = outputStream.toString().replace("\n", "").replace("\r", "") + result;

        System.setOut(printStream);

        System.out.println(output);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

