package ru.aykononov.spring.lesson21.pet.impl;

import org.springframework.stereotype.Component;
import ru.aykononov.spring.lesson21.pet.Pet;

@Component("BeanCat")
public class Cat implements Pet {
    public Cat() {
        System.out.println("Bean Cat is created");
    }

    @Override
    public void say() {
        System.out.println("cat: Maow-Maow");
    }
}
