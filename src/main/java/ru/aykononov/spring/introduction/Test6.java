package ru.aykononov.spring.introduction;

public class Test6 {
    public static void main(String[] args) {
        Pet pet = new Dog();
        Person person = new Person(pet);
        person.callYourPet();
    }
}
