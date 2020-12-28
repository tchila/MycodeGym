package fr.codegym.task.task15.task1530;

public class TeaMaker extends DrinkMaker {

    @Override
    void getRightCup() {
        System.out.println("Prendre une tasse pour thé");
    }

    @Override
    void addIngredients() {
        System.out.println("Ajouter des feuilles de thé");

    }

    @Override
    void pour() {
        System.out.println("Remplir d'eau bouillante");
    }
}
