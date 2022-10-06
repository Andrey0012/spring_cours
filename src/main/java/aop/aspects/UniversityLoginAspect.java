package aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoginAspect {
    @Before("execution(* getStudent())")
    public void beforeReturnGetStudentLoggingAdvice () {
        System.out.println("beforeReturnGetStudent: логирует получение списка студентов пеерд метод getStudent");
    }
    @AfterReturning(pointcut = "execution(* getStudent())", returning = "students")
    public void afterReturnGetStudentLoggingAdvice (List<Student> students) {
      Student firstStudent = students.get(0);

      String nameSurname = firstStudent.getNaneSurname();
      nameSurname = "Mr. "+ nameSurname;
      firstStudent.setNaneSurname(nameSurname);

      int course = firstStudent.getCourse();
      course = course +1;
      firstStudent.setCourse(course);

      double avgGrade = firstStudent.getAvgGrade();
      avgGrade = avgGrade +1;
      firstStudent.setAvgGrade(avgGrade);
        System.out.println("beforeAfterReturnGetStudent: логирует получение списка студентов после метода getStudent");

    }
    @AfterThrowing (pointcut = "execution( * getStudent())", throwing = "exception")
    public void afterThrowingGetStudentLoggingAdvice (Throwable exception) {
        System.out.println("AfterThrowingGetStudentLoggingAdvice: фиксируем исключение " + exception);
    }

    @After("execution( * getStudent())")
    public void afterGetStudentLoggingAdvice () {
        System.out.println("Фиксируем нормальное окончание рботы или ловим исключение");
    }
 }
