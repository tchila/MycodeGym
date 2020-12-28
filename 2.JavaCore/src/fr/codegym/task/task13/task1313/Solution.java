package fr.codegym.task.task13.task1313;

import java.awt.*;

/* 
Un renard est un animal
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
       default Color getColor(){
           return  new Color(1,2,3);
       }
    }

    public static class Fox implements Animal{
        public String getName() {
            return "Renard";
        }


    }
}