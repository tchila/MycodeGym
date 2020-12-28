package task.task29.task2909.human;

import com.codegym.task.task29.task2909.human.Human;

public class Soldier extends Human {
    protected boolean isSoldier;

    public Soldier(String name , int age) {
        super(name,age);
    }

    public void live() {
       
            fight();
    }

    public void fight() {
    }
}
