package com.aop.throwingadvice;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
@RequiredArgsConstructor
public class UnautorizedExceptionAspect {


    @AfterThrowing(value="execution(* com.aop.throwingadvice.Config.*(..)) && @annotation(com.aop.throwingadvice.UnauthorizedException)",throwing="ex")
    public void afterThrowingAdvice(JoinPoint joinPoint, Exception ex)
    {
        System.out.println("After Throwing exception in method:"+joinPoint.getSignature());
        System.out.println("Exception is:"+ex.getMessage());
    }

}
