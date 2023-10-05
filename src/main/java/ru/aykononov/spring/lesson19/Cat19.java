package ru.aykononov.spring.lesson19;

import org.springframework.stereotype.Component;
import ru.aykononov.spring.introduction.Pet;

@Component("catBean")
public class Cat19 implements Pet {
    public Cat19() {
        System.out.println("Bean Cat is created");
    }

    @Override
    public void say() {
        System.out.println("Maow-Maow");
    }
}
