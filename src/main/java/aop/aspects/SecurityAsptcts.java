package aop.aspects;

import aop.Book;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAsptcts {
    @Before("aop.aspects.MyPointcut.allAddMethod()")
    public void BeforeGetSecurityBookAdvice () {
        System.out.println("BeforeGetSecurityBookAdvice: проверка прав на получение книгу/журнал");
        System.out.println("---------------------------------");
    }

}
