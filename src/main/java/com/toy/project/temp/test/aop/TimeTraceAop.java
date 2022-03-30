package com.toy.project.temp.test.aop;


import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogOutputStream;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeTraceAop {

    @Around("execution(* com.toy.project..*(..))") //공통 관심사항
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable{
       long start =  System.currentTimeMillis();
        System.out.println("Start: " + joinPoint.toString());
        try{
            return joinPoint.proceed();
        } finally {
           long finish =  System.currentTimeMillis();
           long timsMs = finish  - start;
            System.out.println("END: " + joinPoint.toString()+ " " + timsMs + "ms");    }
    }
}
