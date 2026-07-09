package net.likelion.bebc25.spring.aop.dynamicProxy;

public class Driver {
    private Car car;

    public Driver(Car car) {
        System.out.println("Constructor injection called : " + car);
        this.car = car;

    }

    public  void driveCar(){
        car.startEngine();
        car.drive();
        car.stopEngine();
    }
}
