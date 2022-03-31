package ru.geekbrains.lesson6;

public class Dog extends Animals {

    public Dog(String name, String color, int age, int count) {
        super(name, color, age, count);
    }

    @Override
    public int run(int runLength) {
        if (runLength > 500) {
            System.out.println("Собака не может столько бегать");
        } else
            System.out.println(this.name + " пробежал - " + runLength);
        return 0;
    }

    @Override
    public int swim(int swimLenght) {
        if (swimLenght > 10) {
            System.out.println("Собака не может столько плавать");
        } else
            System.out.println(this.name + " проплыла - " + swimLenght);
        return 0;
    }


}
