package fr.codegym.task.task13.task1309;

/* 
Tout ce qui se déplace
*/

public class Solution {
    public static void main(String[] args) {
    }

    interface CanMove{
        Double speed();
    }

    interface CanFly extends CanMove {
        Double speed(CanFly canMove);
    }
}