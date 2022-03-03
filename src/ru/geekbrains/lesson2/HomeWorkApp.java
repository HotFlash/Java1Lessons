package ru.geekbrains.lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        //boolean number = comparison(randomizer(20), randomizer(20));
        //boolean number = numberCheck(randomizer(10,2));
        //loopPrint("hello", 5);
        //boolean year = leapYear(800);
    }
public static boolean leapYear(int year) {
        if (year %100 == 0 && year %400 == 0) {
            return true;
        }
        else if (year %4 == 0 && year %100 > 0){
            return true;
        }
        else if (year %100 == 0) {
            return false;
        } else {
            return false;
        }
}
    public static void loopPrint(String word, int loop){
        for (int i = 0; i < loop; i++) {
            System.out.println(word);
        }
    }
    public static boolean numberCheck(int number) {
        return number < 0;
}
    public static void minusCheck(int number) {
        if (number >= 0) {
            System.out.println("положительное число");
        } else {
            System.out.println("отрицательное число");
        }

    }
    public static boolean comparison(int a, int b) {
        int sum = a + b;
        return sum >= 10 & sum <= 20;
}
    public static int randomizer(int lenght, int minus) {
        return switch (minus) {
            case 1 -> (int) (Math.random() * lenght);
            case 2 -> (int) (Math.random() * (lenght + 1)) - 10;
            default -> (int) (Math.random() * lenght);
        };

    }

}

