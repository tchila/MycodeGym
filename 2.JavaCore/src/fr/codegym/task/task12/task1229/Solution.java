package fr.codegym.task.task12.task1229;

/* 
Parent de la classe CTO
*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }
    public static class Help {
        public void workHard()
        {

        }
    }
    public static class CTO extends Help implements Businessman {

    }
}
