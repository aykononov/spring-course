package ru.aykononov.spring.lesson18;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test18 {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application18.xml");

        var personField = context.getBean("personBeanField", Person18AutowiredField.class);
        personField.callYourPet();

        var personSetter = context.getBean("personBeanSetter", Person18AutowiredSetter.class);
        personSetter.callYourPet();

        var personConstructor = context.getBean("personBeanConstructor", Person18AutowiredConstructor.class);
        personConstructor.callYourPet();

        context.close();
    }
}

/*
Bean Cat is created
Bean Dog is created
Bean PersonAutowiredConstructor is created
Bean PersonAutowiredField is created
Bean PersonAutowiredSetter is created
Class PersonAutowiredSetter: set Pet
PersonAutowiredField: Hello, my lovely Pet!
Bow-Wow
PersonAutowiredSetter: Hello, my lovely Pet!
Maow-Maow
PersonAutowiredConstructor: Hello, my lovely Pet!
Maow-Maow
 */