package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order (3)
public class ExceptionHandlingAspects {
    @Before("aop.aspects.MyPointcut.allAddMethod()")
    public void BeforeExceptionsAdvice () {
        System.out.println("BeforeExceptionsAdvice: проверка ошибок или исключений на получение книгу/журнал");
        System.out.println("---------------------------------");
    }
}
