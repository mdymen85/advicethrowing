package com.aop.throwingadvice;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
@RequiredArgsConstructor
public class UnautorizedExceptionAspect {

    @Around(value="execution(* com.aop.throwingadvice.Config.*(..))")
    public Object afterThrowingAdvice(ProceedingJoinPoint joinPoint) throws Exception {
        try {
            return joinPoint.proceed();
        } catch (Exception e) {
            log.info("Exception message : {} ", e.getMessage());
            throw new Exception();
        } catch (Throwable e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

}
