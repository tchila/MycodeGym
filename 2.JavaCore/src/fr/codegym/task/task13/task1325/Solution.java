package fr.codegym.task.task13.task1325;

import java.awt.*;

/* 
Compilation du programme
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Fox bigFox =  new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
         default Color getColor(){
             return Color.BLACK;
         }
    }

    public abstract static class Fox implements Animal {
        public String getName() {
            return "Renard";
        }
    }

    public  static class BigFox extends Fox {

    }

}
