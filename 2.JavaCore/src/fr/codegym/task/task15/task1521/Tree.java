package fr.codegym.task.task15.task1521;

public class Tree {
    public static int globalNumber;
    public int number;

    public Tree() {
        this.number = ++globalNumber;
    }

    public void info(Object s) {
        System.out.println(String.format("Arbre no. %d , méthode Object, paramètre : %s", number, s.getClass().getSimpleName()));
    }
    public void info(Number  s) {
        System.out.println(String.format("Arbre no. %d , méthode Number, paramètre : %s", number, s.getClass().getSimpleName()));
    }
    public void info(String  s) {
        System.out.println(String.format("Arbre no. %d , méthode String, paramètre : %s", number, s.getClass().getSimpleName()));
    }
}
