package ru.geekbrains.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {
    private static final int SIZE = 5;
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static final char DOT_EMPTY = '•';
    private static final char[][] MAP = new char[SIZE][SIZE];

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();

            if (isWin(DOT_X)) {
                System.out.println("Человек победил!");
                break;
            }
            if (isDraw()) {
                break;
            }

            computerTurn();
            printMap();

            if (isWin(DOT_O)) {
                System.out.println("Компьютер победил!");
                break;
            }
            if (isDraw()) {
                break;
            }
        }
    }

    private static boolean isDraw() {
        if (isMapFull()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    private static void humanTurn() {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
                System.out.println("Данные введены некорректно");
            } else if (MAP[x][y] != DOT_EMPTY) {
                System.out.println("Клетка уже занята");
            } else {
                break;
            }

        } while (true);

        MAP[x][y] = DOT_X;
    }

    private static boolean isWin(char symbol) { //вышло не очень красиво, но должно работать на любом размере карты
        int countX = 0;
        int countY = 0;
        int countU = 0;
        int countZ = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[j][j] == symbol) {
                    countX++;
                }
                if (MAP[j][(SIZE - 1) - j] == symbol) {
                    countY++;
                }
                if (MAP[i][j] == symbol) {
                    countU++;
                }
                if (MAP[j][i] == symbol) {
                    countZ++;
                }
            }
            if (countX == SIZE || countY == SIZE || countU == SIZE || countZ == SIZE) {
                return true;
            } else {
                countX = 0;
                countY = 0;
                countU = 0;
                countZ = 0;
            }
        }
        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == DOT_EMPTY) {
                    return false; // когда найдена пустая ячейка, значит можно ещё ходить.
                }
            }
        }
        return true;
    }

    private static void computerTurn() {
        int x;
        int y;
        Random random = new Random();

        do {
            x = random.nextInt(SIZE); // SIZE не включительно
            y = random.nextInt(SIZE);
            System.out.println("Компьютер подобрал координаты " + x + " " + y);
        } while (MAP[x][y] != DOT_EMPTY);

        MAP[x][y] = DOT_O;
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(MAP[i], DOT_EMPTY);
        }
    }

    private static void printMap() {
        printHeader();
        printBody();
    }

    private static void printHeader() {
        for (int i = 0; i <= SIZE; i++) {
            if (i == 0) {
                System.out.print("  ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void printBody() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

