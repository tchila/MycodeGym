package task.task29.task2909.car;

import com.codegym.task.task29.task2909.car.Car;

public class Truck extends Car {
    public Truck(int numberOfPassengers) {
        super( numberOfPassengers);
    }

    @Override
    public int getMaxSpeed() {
            return MAX_TRUCK_SPEED;
    }
}
