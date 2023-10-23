package ru.aykononov.spring.lesson21;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.aykononov.spring.lesson21.config.AppConfig;
import ru.aykononov.spring.lesson21.person.Person;

public class AppMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = context.getBean("BeanPerson", Person.class);
        person.callYourPet();
        context.close();
    }
}
