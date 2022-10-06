package org.kalinin.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Cet cet = context.getBean("myPet", Cet.class);
        Cet cet1 = context.getBean("myPet", Cet.class);
        cet.say();
        context.close();
    }
}
