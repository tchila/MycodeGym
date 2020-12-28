package com.codegym.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Alive {
    public static int nextId = 0;
    private int id;
    protected int age;
    protected String name;
    private List<Human> children = new ArrayList<>();

    protected int[] size;


    public static final int FIRST = 1;
    public static final int SECOND = 2;
    public static final int THIRD = 3;
    public static final int FOURTH = 4;
    private int bloodType;

    public void setBloodType(int code) {
        bloodType = code;
    }

    public int getBloodType() {
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
    public List<Human> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void addChild (Human humain ){
        children.add(humain);
    }

    public void removeChild  (Human humain ){
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

    public void setId(int id) {
        this.id = id;
    }

    public void printSize() {
        System.out.println("Height: " + size[0] + " Weight: " + size[1]);
    }
}