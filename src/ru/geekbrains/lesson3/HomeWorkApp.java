package ru.geekbrains.lesson3;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1}; //массив для переназначения
        arrayRebuild(array);
        System.out.println(Arrays.toString(array)); //проверка переназначения
        int[] array100 = fillArray(100); //заполнение массива
        System.out.println(Arrays.toString(array100)); // проверка заполнения
        int[] arrayMultiple = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; //массив для умножения значений меньше 6
        arrayMultiple(arrayMultiple);
        int[][] quarterArray = new int[10][10]; //массив для изменения значений по диагоналям
        quarterArrayFill(quarterArray);
        int[] builderArray = buildArray(10, 200); // заполнение указанной длины массива указанным значением
        System.out.println(Arrays.toString(builderArray)); // проверка заполнения
        minMaxParser(arrayMultiple);
        int[] isTwoPartSame = {2, 4, 1, 1, 1, 1, 2, 2}; //массив для сравнения частей
        System.out.println(isTwoPartArraySame(isTwoPartSame)); //проверка частей массива с левой частью в 5 ячеек
    }

    public static boolean isTwoPartArraySame(int[] array) { //проверка двух частей массива на равество
        boolean isSame = false;
        int partRightSum = 0;
        for (int k = 0; k < array.length; k++) {
            for (int i = 0; i < array.length; i++) {
                partRightSum += array[i];
                int partLeftSum = 0;
                for (int j = i + 1; j < array.length; j++) {
                    partLeftSum += array[j];
                }
                if (partLeftSum == partRightSum) {
                    isSame = true;
                    return isSame;
                } else {
                    isSame = false;
                }
            }
        }
        return isSame;
    }

    public static void minMaxParser(int[] array) { //поиск наибольшего и нгаименьшего числа в массиве
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            } else if (min >= array[i]) {
                min = array[i];
            }
        }
        System.out.println("наименьшее число: " + min + "\n наибольшее число: " + max);
    }

    public static int[] buildArray(int len, int initialValue) { //заполнение массива по входящей длинне и значению
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void quarterArrayFill(int[][] array) { //изменение значений массива по диагоналям
        int revers = (array.length - 1);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                    array[i][revers] = 2;
                    revers--;
                }
            }
        }
//        for (int i = (array.length - 1); i > 0; i--) {
//            for (int j = (array.length - 1); j > 0; j--) {
//                if (i == j) {
//                    array[i][j] = 3;
//                }
//            }
//        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayMultiple(int[] array) { //умножение чисел меньших 6 на 2
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static int[] fillArray(int cellAmount) { //заполнение массива указанной длинны цифрамми по порядку
        int[] array = new int[cellAmount];
        int j = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = j;
            j++;
        }
        return array;
    }

    public static int[] arrayRebuild(int[] array) { //переназначене значиний в массиве
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 0:
                    array[i] = 1;
                    break;
                case 1:
                    array[i] = 0;
                    break;
            }
        }
        return array;
    }
}
