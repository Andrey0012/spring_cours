package aop.aspects;

import aop.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("university", University.class);
        university.addStudent();
        try {
            List <Student> students = university.getStudent();
            System.out.println(students);
            context.close();
        } catch (Exception e) {System.out.println("было поймано исключение "+e);}

    }

}
