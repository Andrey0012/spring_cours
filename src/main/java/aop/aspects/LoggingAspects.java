package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order (1)
public class LoggingAspects {



//    @Pointcut("execution(* aop.UniLibrary.*())")
//    private void allMethodsFromUniLibrary () {}
//    @Pointcut("execution(public void returnMagazine())")
//    private  void returnMagazineFromUniLibrary () {}
//    @Pointcut ("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary () {}
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeMethodsExceptReturnMagazineFromUniLibrary () {
//        System.out.println("BeforeMethodsExceptReturnMagazineFromUniLibrary: write log #10");
//    }


//
//
//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    public  void  allGetMethodsFromUniLibrary () {}
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    public void allReturnMethodsFromUniLibrary () {}
//    @Pointcut ("allReturnMethodsFromUniLibrary() || allGetMethodsFromUniLibrary()")
//    public void allGetAndReturnMethodsFromUniLibrary () {}
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoginsAdvic () {
//        System.out.println("BeforeGetLoginsAdvic: writing log #1");
//    }
//
//    @Before(("allReturnMethodsFromUniLibrary()"))
//    public void beforeReturnLoginsAdvis () {
//        System.out.println("BeforeReturnLoginsAdvis: writing: log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoginsAdvise () {
//        System.out.println("BeforeGetAndReturnLoginsAdvise: writing log #3");
//    }





    @Before("aop.aspects.MyPointcut.allAddMethod()")
    public void BeforeGetLoginBookAdvice (JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("MethodSignature: " + methodSignature);
        System.out.println("methodSignature.getMethod(): " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType: "+ methodSignature.getReturnType());
        System.out.println("methodSignature.getName():  "+ methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object [] argument = joinPoint.getArgs();
            for (Object obj: argument){
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("название книги -  " + myBook.getName() + "автор" + myBook.getAuthor() +
                            " год выхода " + myBook.getYearOfPublication());
                }
                else if (obj instanceof  String) System.out.println("книгу в библиотеку добавляет " + obj);
            }
        }




        System.out.println("BeforeGetLoginBookAdvice: логирование попытки получить книгу/журнал");
        System.out.println("---------------------------------");
    }





}
