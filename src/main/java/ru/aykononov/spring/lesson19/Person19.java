package ru.aykononov.spring.lesson19;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.aykononov.spring.introduction.Pet;

@Component("personBean19")
public class Person19 {
    @Value("${person.surname}")
    private String surname;

    @Value("${person.age}")
    private int age;

    private Pet pet;

    public Person19() {
        System.out.println("Bean Person is created");
    }

    @Autowired
    public Person19(Pet pet) {
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

    public String getSurname() {
        System.out.print("Person surname: ");
        return surname;
    }

    public int getAge() {
        System.out.print("Person age: ");
        return age;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }
}
