package fr.codegym.task.task14.task1403;

/* 
Bâtiment et école
*/

public class Solution {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        //écris ton code ici
        return new School();
    }

    public static Building getBuilding() {
        //écris ton code ici
        return new Building();
    }

    static class School extends Building{
        @Override
        public String toString() {
            return "École";
        }
    }

    static class Building /*écris ton code ici*/ {
        @Override
        public String toString() {
            return "Bâtiment";
        }
    }
}
