package org.kalinin.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Cet cet = context.getBean("cet", Cet.class);
        Cet cet1 = context.getBean("cet", Cet.class);
        System.out.println(cet==cet1);

    }
}
