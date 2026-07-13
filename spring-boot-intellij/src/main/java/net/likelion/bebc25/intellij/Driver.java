package net.likelion.bebc25.spring.aop.springaop;

public class Driver {
    private Car car;

    public Driver(Car car) {
        System.out.println("Constructor injection called");
        this.car = car;

    }

    public  void driveCar(int maxSpeed){
        car.startEngine();
        car.drive();
        car.stopEngine();
    }
}
