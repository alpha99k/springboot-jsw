package net.likelion.bebc25.Spring;

public class Driver {
    private Car car;

    public Driver(Car car) {
        this.car = car;
    }

    public  void driveCar(){
        car.startEngine();
        car.drive();
        car.stopEngine();
    }
}
