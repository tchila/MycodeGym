package task.task29.task2909.human;

import com.codegym.task.task29.task2909.human.Alive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Alive {
    private static int nextId = 0;
    private int id;
    protected int age;
    protected String name;
    private List<com.codegym.task.task29.task2909.human.Human> children = new ArrayList<>();
    private BloodType bloodType;
    private Size size = new Size();


    public BloodType getBloodType() {
        return bloodType;
    }

    public Human(String name , int age) {
        this.name = name;
        this.age = age;
        this.id = nextId;
        nextId++;
    }

    public void live() {

    }
    public List<com.codegym.task.task29.task2909.human.Human> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void addChild (com.codegym.task.task29.task2909.human.Human humain ){
        children.add(humain);
    }

    public void removeChild  (com.codegym.task.task29.task2909.human.Human humain ){
        children.remove(humain);

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition(){
        return "Person";
    }

    public void printData() {
        System.out.println(getPosition()+": " + name);
    }


    public int getId() {
        return id;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public void printSize() {
        System.out.println("Height: " + size.height + " Weight: " + size.weight);
    }

    public class Size{
        public int height;
        public int weight;


    }


}