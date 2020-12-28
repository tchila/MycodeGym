package fr.codegym.task.task18.task1805;

import java.io.FileInputStream;
import java.util.*;

/* 
Tri d'octets
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Set<Integer> integers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        FileInputStream in = new FileInputStream(s);
        while (in.available() > 0) {
            int i = in.read();
            integers.add(i);
        }
        String outPut = "";
        TreeSet<Integer> treeSet = new TreeSet<Integer>(integers);
        Iterator value = treeSet.iterator();
       while (value.hasNext())
           outPut+=value.next()+" ";
        System.out.println(outPut);
        in.close();
        scanner.close();
    }
}
