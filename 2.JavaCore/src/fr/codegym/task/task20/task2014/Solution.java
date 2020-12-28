package fr.codegym.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Solution sérialisable
*/
public class Solution {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("file");
        FileOutputStream  fileOutputStream = new FileOutputStream (file);
        ObjectOutputStream  writer = new ObjectOutputStream(fileOutputStream);

        FileInputStream fiStream = new FileInputStream(file);
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);

        Solution savedObject = new Solution(4);
        writer.writeObject(savedObject);
        fileOutputStream.close();
        fileOutputStream.close();

        Solution loadedObject = new Solution(5);
         loadedObject =(Solution) objectStream.readObject();

        System.out.println(savedObject.string.equals(loadedObject.string));
    }

    private final transient String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Aujourd'hui nous sommes le %s, est la température actuelle est de %s °C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
