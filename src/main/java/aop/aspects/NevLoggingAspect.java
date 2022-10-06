package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class NevLoggingAspect {
    @Around("execution( public String returnBook())")
    public Object aroundReturnBookLoggingAdvice (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: выполняеться перед выполеннением метода");
  //      long begin = System.currentTimeMillis();
        Object method = null;
        try {
            method = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice: было поймано исключение " + e);
            throw e;
        }

//        long end = System.currentTimeMillis();
//        System.out.println("Время на выполенние метода  =" + (end-begin));
        System.out.println("aroundReturnBookLoggingAdvice: выполняеться ПОСЛЕ выполеннения метода");
        return method;
    }
}
