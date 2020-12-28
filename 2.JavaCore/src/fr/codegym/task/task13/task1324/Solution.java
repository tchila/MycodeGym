package fr.codegym.task.task13.task1324;

import java.awt.*;

/* 
Une méthode dans une classe
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        default Color getColor(){
            return Color.BLACK;
        }

        default Integer getAge(){
            return 0;
        }
    }

    public static class Fox implements Animal {
        public String getName() {
            return "Renard";
        }
    }
}
