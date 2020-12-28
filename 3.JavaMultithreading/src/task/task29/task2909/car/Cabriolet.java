package task.task29.task2909.car;

import com.codegym.task.task29.task2909.car.Car;

public class Cabriolet extends Car {
    public Cabriolet( int numberOfPassengers) {
        super( numberOfPassengers);
    }

    @Override
    public int getMaxSpeed() {
        return MAX_CABRIOLET_SPEED;
    }
}
