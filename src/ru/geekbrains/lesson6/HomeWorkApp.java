package ru.geekbrains.lesson6;

public class HomeWorkApp {
    public static void main(String[] args) {
        int count = 0;
        count++;
        Dog dog1 = new Dog("Бобик", "ченый", 5, count);
        count++;
        Dog dog2 = new Dog("Шарик", "белый", 3, count);
        count++;
        Dog dog3 = new Dog("Полкан", "серый", 9, count);
        count++;
        Cat cat1 = new Cat("Барсик", "ченый", 2, count);
        count++;
        Cat cat2 = new Cat("Фунтик", "белый", 5, count);
        count++;
        Cat cat3 = new Cat("Мурсик", "серый", 4, count);
        count++;

        cat1.run(100);
        cat2.run(200);
        cat3.run(250);
        dog1.run(300);
        dog2.run(400);
        dog3.run(550);
        cat1.swim(100);
        dog1.swim(20);
        dog2.swim(10);
        dog3.swim(50);

    }


}
