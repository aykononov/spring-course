package ru.aykononov.spring.lesson21.pet.impl;

import org.springframework.stereotype.Component;
import ru.aykononov.spring.lesson21.pet.Pet;

@Component("BeanDog")
public class Dog implements Pet {
    private String name;

    public Dog() {
        System.out.println("Bean Dog is created");
    }

    @Override
    public void say() {
        System.out.println("dog: Bow-Wow");
    }
}
