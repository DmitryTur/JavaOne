package ru.geekbrains.java1.lesson7;

public class Cat {
    private String name;
    private int appetite;
    public boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public boolean isSatiety(){
        return satiety;
    }

    public void eat(Plate plate){
        if(appetite <= plate.getFood()) {
            plate.decreaseFood(appetite);
            satiety = true;
            System.out.println(String.format("Кот %s поел из тарелки и его сытость: %s", name,satiety));
        } else {
            System.out.println(String.format("Коту %s не хватает еды", name));
        }
    }
}
