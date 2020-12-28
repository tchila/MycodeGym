package fr.codegym.task.task06.task0616;

/* 
Nombre minimal de static
*/

public class Solution {
    public static int pas;

    public static void main(String[] args) {
        methode1();
    }

    public static void methode1() {
        methode2();
    }

    public static void methode2() {
        new Solution().methode3();
    }

    public void methode3() {
        methode4();
    }

    public  void methode4() {
        pas++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace())
            System.out.println(element);
        if (pas > 1)
            return;
        main(null);
    }
}
