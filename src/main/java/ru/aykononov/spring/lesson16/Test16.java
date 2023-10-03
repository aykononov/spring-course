package ru.aykononov.spring.lesson16;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test16 {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application16.xml");
        var person = context.getBean("personBean16", Person16.class);
        person.callYourPet();
        context.close();
    }
}

/*
Bean Cat is created
Bean Person is created
Class Person: set Pet
Hello, my lovely Pet!
Maow-Maow
 */