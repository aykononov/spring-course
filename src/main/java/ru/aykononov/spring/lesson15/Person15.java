package ru.aykononov.spring.lesson15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.aykononov.spring.introduction.Pet;

@Component("personBean15")
public class Person15 {
    private Pet pet;

    @Autowired
    public Person15(Pet pet) {
        System.out.println("Bean Person is created");
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
