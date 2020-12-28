package com.codegym.task.task27.task2712.kitchen;

import com.codegym.task.task27.task2712.ConsoleHelper;
import com.codegym.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.List;

public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        initDishes();

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        if (dishes.size() == 0)
            return " ";
        else {

            for (int i = 0; i < dishes.size(); i++) {
                stringBuilder.append(dishes.get(i).name());
                if (i < (dishes.size() - 1))
                    stringBuilder.append(",");

            }
            stringBuilder.append("]");

        }
        return "Your order: " + stringBuilder.toString() + " from Tablet{number=" + tablet.getNumber() +"}, cooking time " + getTotalCookingTime() + " min";

    }

    public int getTotalCookingTime(){
        int duration = 0;
        for (Dish dish : dishes) {
            duration+=dish.getDuration();
        }
        return duration;
    }

    public boolean isEmpty(){
        return dishes.isEmpty();
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public Tablet getTablet() {
        return tablet;
    }

    protected void initDishes() throws IOException {
        dishes = ConsoleHelper.getAllDishesForOrder();
    }
}
