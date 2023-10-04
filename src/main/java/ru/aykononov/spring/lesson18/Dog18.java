package ru.aykononov.spring.lesson18;

import org.springframework.stereotype.Component;
import ru.aykononov.spring.introduction.Pet;

@Component("dogBean")
public class Dog18 implements Pet {

    public Dog18() {
        System.out.println("Bean Dog is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
