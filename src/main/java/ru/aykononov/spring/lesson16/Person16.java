package ru.aykononov.spring.lesson16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.aykononov.spring.introduction.Pet;

@Component("personBean16")
public class Person16 {
    private Pet pet;

    public Person16() {
        System.out.println("Bean Person is created");
    }

    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
