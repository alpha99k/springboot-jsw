package net.likelion.bebc25.Spring;

public class GasolineCar implements Car {
    @Override
    public void startEngine() {
        System.out.println("엔진 시동 (가솔린)");
    }
    @Override
    public void drive() {
        System.out.println("주행 (가솔린)");
    }
    @Override
    public void stopEngine() {
        System.out.println("엔진 차단 (가솔린)");
    }
}
