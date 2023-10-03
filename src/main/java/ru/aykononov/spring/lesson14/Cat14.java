package ru.aykononov.spring.lesson14;

import org.springframework.stereotype.Component;
import ru.aykononov.spring.introduction.Pet;

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
