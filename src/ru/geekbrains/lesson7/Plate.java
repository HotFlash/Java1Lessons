package ru.geekbrains.lesson7;

public class Plate {
    private int foodQuantity;

    public int getFoodQuantity() {
        return foodQuantity;
    }

//    public void setFoodQuantity(int foodQuantity) {
//        this.foodQuantity = foodQuantity;
//    }

    public Plate(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public void info() {
        System.out.println("Текущее кол-во еды " + foodQuantity);
    }

    public void decreaseFood(int foodQuantity) {
        if (this.foodQuantity < foodQuantity) {
            System.out.println("Мало еды!");
        } else {
            this.foodQuantity -= foodQuantity;
        }
    }

    public void addFood(int foodAmount) {
        this.foodQuantity += foodAmount;
    }
}
