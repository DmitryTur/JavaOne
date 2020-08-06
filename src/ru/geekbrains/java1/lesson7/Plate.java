package ru.geekbrains.java1.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food){
        this.food+=food;
        System.out.println("Добавляем еду в тарелку...");
    }

    public void decreaseFood(int appetite) {
        food-=appetite;

    }
}
