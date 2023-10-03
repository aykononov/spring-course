package ru.aykononov.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test13Prototype {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application13Prototype.xml");
        var cat = context.getBean("myPet", Cat.class);
        cat.say();
        context.close();
    }
}

/*
Bean Cat is created
Class Cat: init method
Maow-Maow
 */