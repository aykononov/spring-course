package ru.aykononov.spring.lesson18;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.aykononov.spring.introduction.Pet;

@Component("personBeanField")
public class Person18AutowiredField {
    @Autowired
    @Qualifier("dogBean")
    private Pet pet;

    public Person18AutowiredField() {
        System.out.println("Bean PersonAutowiredField is created");
    }

    public void callYourPet() {
        System.out.println("PersonAutowiredField: Hello, my lovely Pet!");
        pet.say();
    }
}
