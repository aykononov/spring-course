package ru.aykononov.spring.lesson19;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.aykononov.spring.lesson18.Person18AutowiredConstructor;
import ru.aykononov.spring.lesson18.Person18AutowiredField;
import ru.aykononov.spring.lesson18.Person18AutowiredSetter;

public class Test19 {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application19.xml");

        var person = context.getBean("personBean19", Person19.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();
    }
}

/*
Bean Cat is created
Bean Person is created
Hello, my lovely Pet!
Maow-Maow
Person surname: Tregulov
Person age: 33
 */