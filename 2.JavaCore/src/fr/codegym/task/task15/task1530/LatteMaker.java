package fr.codegym.task.task15.task1530;

public class LatteMaker extends DrinkMaker{
    @Override
    void getRightCup() {
        System.out.println("Prendre une tasse pour latte");
    }

    @Override
    void addIngredients() {
        System.out.println("Faire du café");

    }

    @Override
    void pour() {
        System.out.println("Remplir de lait mousseux");

    }
}
