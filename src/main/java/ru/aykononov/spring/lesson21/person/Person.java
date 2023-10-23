package ru.aykononov.spring.lesson21.person;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.aykononov.spring.lesson21.pet.Pet;

@Component("BeanPerson")
public class Person {
//    @Autowired
//    @Qualifier("BeanDog")
    private final Pet pet;

    public Person(@Qualifier("BeanCat") Pet pet) {
        this.pet = pet;
        System.out.println("Bean Person is created");
    }

//    @Autowired
//    public Person(@Qualifier("BeanCat") Pet pet) {
//        System.out.println("Bean Person is created");
//        this.pet = pet;
//    }

    public void callYourPet() {
        System.out.println("person: Hello, my lovely Pet!");
        pet.say();
    }
}

/*
Bean Cat is created
Bean Person is created
Bean Dog is created
person: Hello, my lovely Pet!
cat: Maow-Maow
 */