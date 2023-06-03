package team.awc1.member.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


import java.time.LocalDateTime;

@Aspect
@Component
public class CurrentTimeAop {

    // AOP를 사용하여 메소드가 실행되면 실행된 메소드와 현제시각을 찍어준다.
    @Before("execution(* team.awc1..*(..))")
    public void logTimeBeforeMethod(JoinPoint joinPoint) {

        String executedMethod = joinPoint.getSignature().getName();
        String time = String.valueOf(LocalDateTime.now());


        System.out.println("method: " + executedMethod
                + ", Time: " + time);


    }

}
