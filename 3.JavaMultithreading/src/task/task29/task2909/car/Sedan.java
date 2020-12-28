package task.task29.task2909.car;

import com.codegym.task.task29.task2909.car.Car;

public class Sedan extends Car {
    public Sedan(int numberOfPassengers) {
        super( numberOfPassengers);
    }

    @Override
    public int getMaxSpeed() {

            return MAX_SEDAN_SPEED;
    }
}
