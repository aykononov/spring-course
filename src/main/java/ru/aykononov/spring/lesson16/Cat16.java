package ru.aykononov.spring.lesson16;

import org.springframework.stereotype.Component;
import ru.aykononov.spring.introduction.Pet;

@Component("catBean16")
public class Cat16 implements Pet {
    public Cat16() {
        System.out.println("Bean Cat is created");
    }

    @Override
    public void say() {
        System.out.println("Maow-Maow");
    }
}
