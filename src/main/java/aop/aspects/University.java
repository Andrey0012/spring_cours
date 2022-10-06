package aop.aspects;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class University {

    List <Student> universityStudent = new ArrayList<>();

    public void addStudent () {
        Student student = new Student("Andrey Kalinin", 4, 4.5);
        Student student1 = new Student("Ily Ruraev", 5, 4.8);
        Student student2 = new Student("Ivan Ivanov", 2, 4.1);
        universityStudent.add(student);
        universityStudent.add(student1);
        universityStudent.add(student2);
    }
    public List<Student> getStudent () {
        System.out.println("Начинаем работать с методом getStudent");
       // System.out.println(universityStudent.get(3));
        System.out.println("Информация из метода getStudent");
        System.out.println(universityStudent);
        return universityStudent;
    }
}
