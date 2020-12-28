package fr.codegym.task.task13.task1308;

/* 
Hé, tu es toujours en vie ?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Person{
        boolean isAlive();
    }

    interface Presentable extends  Person{
        boolean isAlive();
    }
}