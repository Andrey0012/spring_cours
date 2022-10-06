package org.kalinin.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component ("personBin")

public class Person {
    @Value("${Person.surname}")
    private String surname;
    @Value("${Person.age}")
    public int age;
//    @Autowired
//    @Qualifier ("dogBin")
    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Person bean is create");
        this.pet = pet;
    }

//    @Autowired
//    public Person(@Qualifier ("cet") Pet pet) {
//        System.out.println("Person bean is create");
//        this.pet = pet;
//    }

//    public Person() {
//    System.out.println("Person bean is create");}
//    @Autowired
//    @Qualifier ("cet")
    public void setPet(Pet pet) {
        System.out.println("Create set");
        this.pet = pet;}


    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        System.out.println("Class Person: setSurname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: setAge");
        this.age = age;
    }

    public void callYourPet () {
        System.out.println("Hello");
        pet.say();}
}
