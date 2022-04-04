package ru.geekbrains.lesson7;

import ru.geekbrains.lesson5.Employee;

public class HomeWorkApp {
    public static void main(String[] args) {
        Cat[] catsArray = {new Cat("Max", 60, 100),
                new Cat("Барсик", 50, 150),
                new Cat("Мурзик", 60, 80)} ;
        Plate plate = new Plate(160);

        plate.info();
        for (int i = 0; i < catsArray.length; i++) {
            if ((plate.getFoodQuantity() - catsArray[i].getAppetite()) < 0) {
                System.out.println("Недостаточно еды в тарелке");
                System.out.println("Добавим чуть-чуть");
                plate.addFood(100);
                plate.info();
                catsArray[i].eat(plate);
            } else {
            catsArray[i].eat(plate);
            }
        }
        System.out.println("\n");
        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i].catInfo();
        }
        plate.info();
    }
}
