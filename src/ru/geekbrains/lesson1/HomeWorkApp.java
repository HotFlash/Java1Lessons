package ru.geekbrains.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = (int) ( Math.random() * (20 + 1)) - 10; //Генерирую случайное число от -10 до 10  и вношу в переменную
        int b = (int) ( Math.random() * (20 + 1)) - 10;
        if (a + b >= 0) { //проверяю условия сложения
            System.out.println("Сумма положительная"); //вывожу сообщение если сумма больше 0
        } else {
            System.out.println("Сумма отрицательная"); // вывожу сообщения если сумма меньше 0
        }
    }
    public static void printColor() {
        int value = (int) ( Math.random() * (400 + 1)) - 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = (int) ( Math.random() * 10); //Генерирую случайное число от 0 до 10  и вношу в переменную
        int b = (int) ( Math.random() * 10);
        //проверяю условие где а больше или равно b
        if (a >= b ) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
