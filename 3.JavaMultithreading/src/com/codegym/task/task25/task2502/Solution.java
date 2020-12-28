package com.codegym.task.task25.task2502;

import java.util.*;

/* 
Don't take the car to the shop!

*/
public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() throws Exception {
            // Init wheels here
            if(loadWheelNamesFromDB().length!=4)
                throw new Exception();
            wheels = new ArrayList<>();
            for (String s : loadWheelNamesFromDB()) {
                try {
                    Wheel wheel = Wheel.valueOf(s);
                    wheels.add(wheel);
                }catch (IllegalArgumentException e){
                    throw new Exception(e);
                }

            }
        }

        protected String[] loadWheelNamesFromDB() {
            // This method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
    }
}
