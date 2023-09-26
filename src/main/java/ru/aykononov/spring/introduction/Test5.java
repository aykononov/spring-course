package ru.aykononov.spring.introduction;

public class Test5 {
    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.say();
        pet = new Cat();
        pet.say();
    }
}
