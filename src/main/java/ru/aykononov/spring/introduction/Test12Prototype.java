package ru.aykononov.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test12Prototype {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationPrototype.xml");
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
Dog bean is created
dog1 == dog2 is false
dog1: ru.aykononov.spring.introduction.Dog@1a052a00
dog2: ru.aykononov.spring.introduction.Dog@4d826d77
dog1 Name: Belka
dog2 Name: Strelka
 */