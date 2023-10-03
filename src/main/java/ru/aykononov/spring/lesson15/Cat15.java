package ru.aykononov.spring.lesson15;

import org.springframework.stereotype.Component;
import ru.aykononov.spring.introduction.Pet;

@Component("catBean15")
public class Cat15 implements Pet {
    public Cat15() {
        System.out.println("Bean Cat is created");
    }

    @Override
    public void say() {
        System.out.println("Maow-Maow");
    }
}
