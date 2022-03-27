package ru.geekbrains.lesson6;

import java.util.Objects;

public abstract class Animals {
    protected String name;
    protected String color;
    protected int age;
    protected static int count;


    public Animals(String name, String color, int age, int count) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.count = count;
    }

    public abstract int run(int runLength);

    public abstract int swim(int swimLenght);

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
