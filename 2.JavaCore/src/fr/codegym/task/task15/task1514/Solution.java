package fr.codegym.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Modificateurs static : partie 1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();
    static {
        labels.put(1.0,"hI");
        labels.put(2.0,"FI");
        labels.put(3.0,"sI");
        labels.put(4.0,"rI");
        labels.put(5.0,"yI");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
