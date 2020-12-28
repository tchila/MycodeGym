package com.codegym.task.task30.task3008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        String s = null;
        boolean read = false;
        while (!read) {
            try {
                s = reader.readLine();
                read = true;
            } catch (IOException e) {
                System.out.println("An error occurred while trying to enter text. Try again.");
            }
        }

        return s;
    }

    public static int readInt(){
        boolean read = false;
        int i = Integer.MIN_VALUE;
        while (!read) {
            try {
                i = Integer.parseInt(readString());
                read = true;
            } catch (NumberFormatException e) {
                System.out.println("An error while trying to enter a number. Try again.");
            }
        }
        return  i;
    }
}
