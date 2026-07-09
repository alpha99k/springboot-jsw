package net.likelion.bebc25.spring.di.setter;

public class HybridCar implements Car {
    @Override
    public void startEngine() {
        System.out.println("시스템 시동 (하이브리드)");
    }
    @Override
    public void drive() {
        System.out.println("주행 (하이브리드)");
    }
    @Override
    public void stopEngine() {
        System.out.println("시스템 차단 (하이브리드)");
    }
}
