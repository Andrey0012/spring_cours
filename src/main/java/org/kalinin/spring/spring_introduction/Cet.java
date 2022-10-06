package org.kalinin.spring.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("prototype")
public class Cet implements Pet{
    public String getName() {
        return name;
    }

    private String name;

    public Cet() {
        System.out.println("Cet bean is created");
    }

    public void setName(String name) {
        this.name = name;
    }
//    @PostConstruct
//    private void init () {
//        System.out.println("Cat - init ");
//    }
//    @PreDestroy
//    public void destroy () {
//        System.out.println("Cat - destroy");
//    }

    @Override
    public void say() {
        System.out.println("Мяу-мяу");
    }
}
