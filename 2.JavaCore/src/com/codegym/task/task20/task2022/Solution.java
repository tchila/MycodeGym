package com.codegym.task.task20.task2022;

import java.io.*;

/* 
Overriding serialization in a thread

*/
public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    private String fileName;


    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        //out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        stream =  new FileOutputStream(fileName,true);
        in.defaultReadObject();
        //in.close();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution solution = new Solution("fileName");
        solution.writeObject("test");
        solution.writeObject(new ObjectOutputStream(solution.stream));
        Solution newObject = new Solution("fileName");
        newObject.readObject(new ObjectInputStream(new FileInputStream("fileName")));

    }
}
