package org.kalinin.spring.spring_introduction;

import org.springframework.stereotype.Component;

//@Component ("dogBin")
public class Dog implements Pet{
    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Гав-гав");
    }
}
