package com.sr.aop.aspects;

import com.sr.aop.model.GreetingResponse;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {

    @Around("@annotation(com.sr.aop.annotations.RequiresLock)")
    public Object doResponse(ProceedingJoinPoint joinPoint) throws Throwable {
        final String name = (String) joinPoint.getArgs()[0];

        if("Sean".equalsIgnoreCase(name)){
           return joinPoint.proceed();
        }
        else
        {
            GreetingResponse response = new GreetingResponse();
            response.setGreeting("Bad luck your name isn't Sean");
            response.setGenerated(LocalDateTime.now());
            return ResponseEntity.ok(response);
        }
    }
}
