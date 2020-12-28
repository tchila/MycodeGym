package fr.codegym.task.task14.task1405;

/* 
Nourriture
*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food) {
        food.onEat();
        food.onSelect();
    }

    public static void selectableMethods(Selectable selectable) {
        //écris ton code ici
        if(selectable instanceof Food){
            selectable.onSelect();
        }

    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable {
        public void onEat() {
            System.out.println("La nourriture a été mangée");
        }

        @Override
        public void onSelect() {
            System.out.println("La nourriture a été sélectionnée");
        }
    }
}
