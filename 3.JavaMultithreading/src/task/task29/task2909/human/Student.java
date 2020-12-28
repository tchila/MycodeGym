package task.task29.task2909.human;

import com.codegym.task.task29.task2909.human.UniversityPerson;

import java.util.Date;

public class Student extends UniversityPerson {

    private double averageGrade;
    private Date beginningOfSession;
    private Date endOfSession;
    private int course;


    public Student(String name, int age, double averageGrade) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }


    public int getCourse() {
        return course;
    }
    public void live() {
        learn();
    }

    public void learn() {
    }



    public void incAverageGrade(double delta){
        setAverageGrade(getAverageGrade()+delta);
    }


    public void setCourse(int value) {
        course =  value;

    }
    public void setAverageGrade(double value){
        averageGrade = value;

    }

    public void setBeginningOfSession(Date date) {
        beginningOfSession = date;
    }

    public void setEndOfSession(Date date) {
        endOfSession = date;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public String getPosition(){
        return "Student";
    }
}