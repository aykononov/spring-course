package ru.aykononov.spring.introduction;

public class Cat implements Pet {
    public Cat() {
        System.out.println("Bean Cat is created");
    }

    public void init() {
        System.out.println("Class Cat: init method");
    }

    public void destroy() {
        System.out.println("Class Cat: destroy method");
    }

    @Override
    public void say() {
        System.out.println("Maow-Maow");
    }
}
