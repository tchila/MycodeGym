package fr.codegym.task.task15.task1524;

/* 
Ordre de chargement des variables
*/

public class Solution {
    static {
        init();
    }
    public static void init() {
        System.out.println("static void init()");
    }

    static {
        System.out.println("Bloc statique");
    }

    {
        System.out.println("Bloc non statique");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "Prénom";


    public Solution() {
        System.out.println("Constructeur de Solution");
        printAllFields(this);
    }


    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);

    }
}
