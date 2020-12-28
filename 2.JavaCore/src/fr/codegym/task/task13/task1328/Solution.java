package fr.codegym.task.task13.task1328;

/* 
Guerres de robots
*/

public class Solution {
    public static void main(String[] args) {
        Robot amigo = new Robot("Amigo");
        Robot enemy = new Robot("Ennemi");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defended = robotFirst.defend();
        System.out.println(String.format("%%s a attaqué %s : %s a subi une attaque, et %s a reçu une défense",
                robotFirst.getName(), robotSecond.getName(), attacked, defended));
    }
}
