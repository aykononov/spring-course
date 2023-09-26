package ru.aykononov.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test7Context {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        context.close();
    }
}
