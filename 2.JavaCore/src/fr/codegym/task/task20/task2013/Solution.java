package fr.codegym.task.task20.task2013;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Personne Externalizable
*/
public class Solution {
    public static class Person implements Externalizable {

        private static final long serialVersionUID = 1L;

        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(mother);
            out.writeObject(father);
            out.writeObject(firstName);
            out.writeObject(lastName);
            out.writeInt(age);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            firstName = in.readLine();
            lastName = in.readLine();
            father = (Person)in.readObject();
            mother = (Person)in.readObject();
            age = in.readInt();
            children = (List)in.readObject();
        }
    }

    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\karabou\\Documents\\project\\CodeGymTasks\\CodeGymTasks\\2.JavaCore\\src\\fr\\codegym\\task\\task20\\task2013\\ff");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        Person userInfo = new Person("Paul", "Piper", 8);
        Person mother = new Person("Paul", "Piper", 8);
        Person father = new Person("Paul", "Piper", 8);
        userInfo.setFather(father);
        userInfo.setMother(mother);
        List<Person> children = new ArrayList<>();
        children.add(mother);
        children.add(father);
        userInfo.setChildren(children);

        objectOutputStream.writeObject(userInfo);

        objectOutputStream.close();
    }
}
