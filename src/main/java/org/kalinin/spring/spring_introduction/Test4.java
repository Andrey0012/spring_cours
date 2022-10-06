package org.kalinin.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Cet cet = context.getBean("myPet", Cet.class);
        cet.setName("Belka");
        Cet myCet =  context.getBean("myPet", Cet.class);
        myCet.setName("Strelka");
        System.out.println(cet==myCet);
        System.out.println(cet.getName());
        System.out.println(myCet.getName());

    }


}
