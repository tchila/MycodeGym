package com.codegym.task.task37.task3702.female;

import com.codegym.task.task37.task3702.AbstractFactory;
import com.codegym.task.task37.task3702.Human;

public class FemaleFactory implements AbstractFactory {
    public Human getPerson(int age){
        if(age<13){
            return new KidGirl();
        }else if(age>12 &&  age<20){
            return new TeenGirl();
        }else {
            return new Woman();
        }
    }
}
