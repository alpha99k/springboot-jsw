package net.likelion.bebc25.Spring.aop.dynamicProxy;

public class AfterTest {
    static void main(String[] args) {
        Car car = new HybridCar();
        Driver driver = new Driver(car);
        driver.driveCar();
    }

}
