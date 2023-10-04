package ru.aykononov.spring.lesson18;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.aykononov.spring.introduction.Pet;

@Component("personBeanConstructor")
public class Person18AutowiredConstructor {
    private final Pet pet;

    @Autowired
    public Person18AutowiredConstructor(@Qualifier("catBean") Pet pet) {
        System.out.println("Bean PersonAutowiredConstructor is created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("PersonAutowiredConstructor: Hello, my lovely Pet!");
        pet.say();
    }
}
