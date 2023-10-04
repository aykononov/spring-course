package ru.aykononov.spring.lesson18;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.aykononov.spring.introduction.Pet;

@Component("personBeanSetter")
public class Person18AutowiredSetter {
    private Pet pet;

    @Autowired
    @Qualifier("catBean")
    public void setPet(Pet pet) {
        System.out.println("Class PersonAutowiredSetter: set Pet");
        this.pet = pet;
    }

    public Person18AutowiredSetter() {
        System.out.println("Bean PersonAutowiredSetter is created");
    }

    public void callYourPet() {
        System.out.println("PersonAutowiredSetter: Hello, my lovely Pet!");
        pet.say();
    }
}
