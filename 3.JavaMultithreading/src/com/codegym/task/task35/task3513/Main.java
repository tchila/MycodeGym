package com.codegym.task.task35.task3513;

import com.sun.javafx.logging.JFRInputEvent;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame game = new JFrame();
        Model model = new Model();
        Controller controller = new Controller(model);
        game.setTitle("2048");
        game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game.setSize(450, 500);
        game.setResizable(false);

        game.add(controller.getView());

        game.setLocationRelativeTo(null);
        game.setVisible(true);
    }
}
