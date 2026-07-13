package net.likelion.bebc25.spring.componentscan;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class LoggingAspect {
    @Pointcut("execution(* net.likelion.bebc25.spring.componentscan.Driver.*(..))")
    private void springAopPackegeMethod(){ }

    @Before("springAopPackegeMethod()")
    public void logBefore(JoinPoint joinPoint){    // 메서드 수행 전에 로그 메세지 출력
        System.out.println("[AOP 로그 - before] 메서드 실행 전에 처리할 코드를 작성합니다.");
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
    }

    @After("springAopPackegeMethod()")
    public void logAfter(){     // 메서드 수행 전에 로그 메세지 출력
        System.out.println("[AOP 로그 - After] 메서드 실행 전에 처리할 코드를 작성합니다.");

    }

    @Around("springAopPackegeMethod()")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {    // 메서드 수행 전/후에 로그 메세지 출력
        System.out.println("[AOP 로그 - around] 메서드 실행 전에 처리할 코드를 작성합니다.");
        joinPoint.proceed();
        System.out.println("[AOP 로그 - around] 메서드 실행 후에 처리할 코드를 작성합니다.");
    }
}
