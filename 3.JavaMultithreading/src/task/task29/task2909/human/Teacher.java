package task.task29.task2909.human;

import com.codegym.task.task29.task2909.human.UniversityPerson;

public class Teacher extends UniversityPerson {
    private int numberOfStudents;

    public Teacher(String name, int age, int numberOfStudents) {
        super(name,age);
        this.numberOfStudents = numberOfStudents;
    }



    public void live() {
        teach();
    }

    public void teach() {
    }


    public String getPosition(){
        return "Teacher";
    }
}