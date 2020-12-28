package fr.codegym.task.task16.task1606;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* 
join : au bon endroit au bon moment
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        PrintListThread firstThread = new PrintListThread("firstThread");
        PrintListThread secondThread = new PrintListThread("secondThread");
        firstThread.start();
        firstThread.join();
        secondThread.start();
    }

    public static void printList(List<String> list, String threadName) {
        for (String item : list) {
            System.out.println(String.format("%s : %s", threadName, item));
        }
    }

    public static List<String> getList(int n) {
        List<String> result = new ArrayList<>();
        if (n < 1) return result;
        result = IntStream.range(0, n).mapToObj(i -> String.format("String %d", (i + 1))).collect(Collectors.toList());
        return result;
    }

    public static class PrintListThread extends Thread {
        public PrintListThread(String name) {
            super(name);
        }

        public void run() {
            printList(getList(20), getName());
        }
    }
}
