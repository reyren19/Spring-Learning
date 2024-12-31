// This module is called an Aspect
package org.example.aopPractice;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
// This method is called an advice
public class LoggingAspect {

    // This is a point cut i.e. where to apply the advice to, in this case all methods in UserService
    @Around("execution(* org.example.aopPractice.UserService.*(..))")
    public Object logSomething(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before method execution: User being accessed!");

        // Proceed with the target method execution
        Object result = joinPoint.proceed();

        System.out.println("After method execution: Method completed!");
        return result;
    }
}

/*
ProceedingJoinPoint is an extension of the JoinPoint that exposes the additional proceed() method.
When invoked, the code execution jumps to the next advice or to the target method. It gives us
the power to control the code flow and decide whether to proceed or not with further invocations.
*/