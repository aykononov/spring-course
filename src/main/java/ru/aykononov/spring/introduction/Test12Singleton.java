package ru.aykononov.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test12Singleton {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationSingleton.xml");
        var dog1 = context.getBean("myPet", Dog.class);
        var dog2 = context.getBean("myPet", Dog.class);
        System.out.println("dog1 == dog2 is " + (dog1 == dog2));
        System.out.println("dog1: " + dog1);
        System.out.println("dog2: " + dog2);
        dog1.setName("Belka");
        dog2.setName("Strelka");
        System.out.println("dog1 Name: " + dog1.getName());
        System.out.println("dog2 Name: " + dog2.getName());
        context.close();
    }
}

/*
Dog bean is created
dog1 == dog2 is true
dog1: ru.aykononov.spring.introduction.Dog@2357d90a
dog2: ru.aykononov.spring.introduction.Dog@2357d90a
dog1 Name: Strelka
dog2 Name: Strelka
*/