package com.codegym.task.task32.task3203;

import java.io.*;

/*
Writing a stack trace

*/
public class Solution {
    public static void main(String[] args) {
        String text = getStackTrace(new IndexOutOfBoundsException("fff"));
        System.out.println(text);
    }

    public static String getStackTrace(Throwable throwable) {
        StringWriter writer = new StringWriter();
        PrintWriter stream = new PrintWriter(writer);
        throwable.printStackTrace(stream);
        return writer.toString();
    }
}