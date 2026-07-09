package net.likelion.bebc25.spring.aop.staticProxy;

public class LogProxy implements Car{
    private final Car target;   //  진짜 Car 객체

    public LogProxy(Car target){
        this.target = target;
    }

    @Override
    public void startEngine() {
        System.out.println("[메서드 실행 전] 엔진 체크");
        target.startEngine();
    }

    @Override
    public void drive() {
        System.out.println("[메서드 실행 전후] 안전벨트 착용");
        target.drive();
        System.out.println("[메서드 실행 전후] 안전벨트 해제");
    }

    @Override
    public void stopEngine() {
        target.stopEngine();
        System.out.println("[메서드 실행 전] 하차");
    }
}
