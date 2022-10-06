package aop.aspects;

import aop.MyConfig;
import aop.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibraryBean", UniLibrary.class);
        System.out.println("начало выполение метода MEIN");
        String book = uniLibrary.returnBook();
        System.out.println("в библиотеку вернули книгу"+book);
        System.out.println("конец выполеннием метода MEIN");
    }
}
