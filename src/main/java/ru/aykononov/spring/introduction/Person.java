package ru.aykononov.spring.introduction;

public class Person {
    private String surname;

    private int age;

    private Pet pet;

    public Person() {
        System.out.println("Bean Person is created");
    }

    public Person(Pet pet) {
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
        return surname;
    }

    public int getAge() {
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
