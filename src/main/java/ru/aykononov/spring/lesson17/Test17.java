package ru.aykononov.spring.lesson17;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.aykononov.spring.lesson16.Person16;

public class Test17 {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application17.xml");
        var person = context.getBean("personBean17", Person17.class);
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