package ru.aykononov.spring.introduction;

public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Maow-Maow");
    }
}
