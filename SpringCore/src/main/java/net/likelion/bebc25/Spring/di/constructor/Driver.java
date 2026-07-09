package net.likelion.bebc25.Spring.di.constructor;

public class Driver {
    private Car car;

    public Driver(Car car) {
        System.out.println("Constructor injection called");
        this.car = car;

    }

    public  void driveCar(){
        car.startEngine();
        car.drive();
        car.stopEngine();
    }
}
