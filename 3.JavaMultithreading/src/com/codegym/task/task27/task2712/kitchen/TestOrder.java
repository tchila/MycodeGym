package com.codegym.task.task27.task2712.kitchen;

import com.codegym.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestOrder extends Order {
    public TestOrder(Tablet tablet) throws IOException {
        super(tablet);
    }

    @Override
    protected void initDishes() {
        dishes = new ArrayList<>();
        Dish[] values = Dish.values();

        int howManyDishes = new Random().nextInt(values.length) + 1;
        while (howManyDishes-- > 0) {
            int dishNumber = new Random().nextInt(values.length);
            dishes.add(values[dishNumber]);
        }
    }
}
