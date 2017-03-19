package org.library;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Pointcut("execution(* org.library.LibraryService.getBooksList(..))")
    private void getBooksListMethod() {

    }

    @Before("getBooksListMethod()")
    public void logBefore(JoinPoint joinPoint) {
        System.err.println("Before "
                + joinPoint.getTarget().getClass().getSimpleName()
                + " "
                + joinPoint.getSignature().getName());
    }

    @AfterReturning (pointcut = "getBooksListMethod()", returning = "returnValue")
    public void logAfter(Object returnValue) {
        System.err.println("returned value = "
                + returnValue
                + "/"
                + returnValue.getClass().getSimpleName());
    }
}
