package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private  int satiety;

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
public int getAppetite(){
        return appetite;
}
    public void catInfo() {
        System.out.println("Кот " + this.name + " Еще голоден на: " + this.satiety);
    }

    public void eat(Plate plate) {
        if ((plate.getFoodQuantity() - this.appetite) < 0) {
            System.out.println("Недостаточно еды в тарелке");
        } else if ((this.satiety - this.appetite) >= 0) {
            System.out.println("Кот " + this.name + " начал есть, съел " + this.appetite);
            plate.decreaseFood(appetite);
            satiety -= this.appetite;
//            System.out.println("Кот " + this.name + " Еще голоден на: " + this.satiety);
        } else {
            System.out.println("Кот " + this.name + " наелся!");
        }
    }
}
