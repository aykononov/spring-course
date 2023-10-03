package ru.aykononov.spring.lesson14;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.aykononov.spring.introduction.Cat;

public class Test14 {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application14.xml");
        var cat = context.getBean("catBean14", Cat14.class);
        cat.say();
        context.close();
    }
}

/*
Bean Cat is created
Maow-Maow
 */