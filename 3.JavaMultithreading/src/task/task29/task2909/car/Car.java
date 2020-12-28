package task.task29.task2909.car;

import java.util.Date;

public abstract class Car {
    static public final int TRUCK = 0;
    static public final int SEDAN = 1;
    static public final int CABRIOLET = 2;
    static public final int MAX_TRUCK_SPEED = 80;
    static public final int MAX_SEDAN_SPEED = 120;
    static public final int MAX_CABRIOLET_SPEED = 90;

    double fuel;

    public double summerFuelConsumption;
    public double winterFuelConsumption;
    public double winterWarmingUp;

    private int type;

    private boolean driverAvailable;
    private int numberOfPassengers;

    protected Car(int type, int numberOfPassengers) {
        this.type = type;
        this.numberOfPassengers = numberOfPassengers;
    }

    public void fill(double numberOfGallons) throws Exception {
        if (numberOfGallons < 0)
            throw new Exception();
        fuel += numberOfGallons;
    }

    public boolean isSummer(Date date , Date summerStart, Date summerEnd){
        return date.after(summerStart) && date.before(summerEnd);
    }

    public double getWinterConsumption(int length){
        return length * winterFuelConsumption + winterWarmingUp;

    }

    public double getSummerConsumption(int length){
        return length * summerFuelConsumption;

    }
    public double getTripConsumption(Date date, int length, Date summerStart, Date summerEnd) {
        double consumption;
        if (!isSummer(date, summerStart, summerEnd)) {

           consumption = getWinterConsumption(length)  ;
        } else {
          consumption = getSummerConsumption(length);
        }
        return consumption;
    }

    public Car(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengersThatCanBeCarried() {
        if (!canPassengersBeCarried())
            return 0;

        return numberOfPassengers;
    }

   private boolean canPassengersBeCarried(){
        return isDriverAvailable() && fuel>0;
    }

    public boolean isDriverAvailable() {
        return driverAvailable;
    }

    public void setDriverAvailable(boolean driverAvailable) {
        this.driverAvailable = driverAvailable;
    }

    public void startMoving() {
        if (numberOfPassengers > 0) {
            fastenPassengerBelts();
        }
            fastenDriverBelt();

    }

    public void fastenPassengerBelts() {
    }

    public void fastenDriverBelt() {
    }

    public abstract int getMaxSpeed();

   public static com.codegym.task.task29.task2909.car.Car create(int type, int numberOfPassengers){
        if(type ==0){
            return new Truck(numberOfPassengers);
        }
        if(type == 1){
            return new Sedan(numberOfPassengers);

        }
        if(type == 2){
            return new Cabriolet(numberOfPassengers);

        }
        return null;
    }
}