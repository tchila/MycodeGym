package fr.codegym.task.task14.task1419;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Invasion d'exceptions
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // La première exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);

        }

        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new ClassCastException());
        exceptions.add(new ClassNotFoundException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new IllegalAccessException());
        exceptions.add(new CloneNotSupportedException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new IllegalStateException());

    }
}
