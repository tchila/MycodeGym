package fr.codegym.task.task15.task1518;

/* 
Modificateurs statiques et chatons
*/

public class Solution {
    public static Cat cat;
   static  {
        cat=  new Cat();

        System.out.println(cat.name);
    }

    public static void main(String[] args) {

    }

    public static class Cat {
        public String name = "Milou";
    }
}
