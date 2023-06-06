package team.awc1.member.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Aspect
@Component
public class CurrentTimeAop {

    // AOP를 사용하여 메소드가 실행되면 실행된 메소드와 현제시각을 찍어준다.
    @After("execution(* team.awc1..*(..))")
    public void logTimeBeforeMethod(JoinPoint joinPoint) {

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");

        String executedMethod = joinPoint.getSignature().getName();
//        String time = String.valueOf(dateFormat.format(date));
        String time = dateFormat.format(date);

        System.out.println("method name : " + executedMethod
                + ", Time : " + time);


    }

}
