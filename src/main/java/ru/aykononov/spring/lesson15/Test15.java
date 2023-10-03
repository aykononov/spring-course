package ru.aykononov.spring.lesson15;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test15 {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application15.xml");
        var person = context.getBean("personBean15", Person15.class);
        person.callYourPet();
        context.close();
    }
}

/*
Bean Cat is created
Bean Person is created
Hello, my lovely Pet!
Maow-Maow
 */