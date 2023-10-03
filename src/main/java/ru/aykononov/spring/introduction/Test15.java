package ru.aykononov.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test15 {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application14.xml");
        var person = context.getBean("personBean", Person.class);
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