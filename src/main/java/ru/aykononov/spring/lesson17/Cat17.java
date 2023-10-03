package ru.aykononov.spring.lesson17;

import org.springframework.stereotype.Component;
import ru.aykononov.spring.introduction.Pet;

@Component("catBean17")
public class Cat17 implements Pet {
    public Cat17() {
        System.out.println("Bean Cat is created");
    }

    @Override
    public void say() {
        System.out.println("Maow-Maow");
    }
}
