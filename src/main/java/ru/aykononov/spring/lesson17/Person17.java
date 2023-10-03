package ru.aykononov.spring.lesson17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.aykononov.spring.introduction.Pet;

@Component("personBean17")
public class Person17 {
    @Autowired
    private Pet pet;

    public Person17() {
        System.out.println("Bean Person is created");
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
