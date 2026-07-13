package net.likelion.bebc25.spring.componentscan;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(/*value=*/"hcar")    //빈의 이름은 hcar로 지정
@Primary    // 동일 타입의 여러 빈 중에 메인으로 지정
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
