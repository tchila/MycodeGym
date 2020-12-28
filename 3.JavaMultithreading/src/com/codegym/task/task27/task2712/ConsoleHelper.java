package com.codegym.task.task27.task2712;

import com.codegym.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {
    public static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return bufferedReader.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> dishes = new ArrayList<>();
        System.out.println(Dish.allDishesToString());
        String enter = null;
        while (!(enter = readString()).equals("exit")) {
            try {
                dishes.add(Dish.valueOf(enter));
            } catch (IllegalArgumentException e) {
                ConsoleHelper.writeMessage("No such Type");
            }
        }
        return dishes;
    }
}
