package ru.aykononov.spring.introduction;

import org.springframework.stereotype.Component;

@Component("catBean14")
public class Cat14 implements Pet {
    public Cat14() {
        System.out.println("Bean Cat is created");
    }

    @Override
    public void say() {
        System.out.println("Maow-Maow");
    }
}
