package ru.geekbrains.lesson6;

public class Cat extends Animals {
    public Cat(String name, String color, int age, int count) {
        super(name, color, age, count);
    }

    @Override
    public int run(int runLength) {
        if (runLength > 200) {
            System.out.println("Кошка не может столько бегать");
        } else
            System.out.println(this.name + " пробежал - " + runLength);
            return 0;
    }

    @Override
    public int swim(int swimLenght) {
        if (swimLenght > 0) {
            System.out.println("Кошка не может плавать");
        }
        return 0;
    }


}
