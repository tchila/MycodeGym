package task.task29.task2909.human;

import com.codegym.task.task29.task2909.human.Human;
import com.codegym.task.task29.task2909.human.University;

public class UniversityPerson extends Human {
    private University university;

    public UniversityPerson(String name, int age) {
        super(name, age);
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
