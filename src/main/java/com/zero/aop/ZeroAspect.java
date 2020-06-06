package com.zero.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Author: Zero <br>
 * Date: 2020-06-06
 * COMPANY: Zero有限公司
 * DESCRIPTION: The copyright belongs to Zero,if you have any problems,please contact him.
 */
@Component
@Aspect
public class ZeroAspect {

    @Pointcut("execution(* com.zero.dao.*.*(..))")
    public void pointcut() {}

    /*@Before("pointcut()")
    public void before() {
        System.out.println("before");
    }

    @After("pointcut()")
    public void after() {
        System.out.println("after");
    }*/

    @Around("pointcut()")
    public void arount(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before");
        pjp.proceed();
        System.out.println("around after");
    }
}
