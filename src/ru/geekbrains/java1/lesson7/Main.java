package ru.geekbrains.java1.lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[]cats = {
                new Cat("Barsik", 25, false),
                new Cat("Murzik", 30, false),
                new Cat("Pirat", 30, false),
                new Cat("Vaska", 20, false),
        };

        Plate plate = new Plate(100);

        feedCats(cats,plate,30);
    }
    static void feedCats(Cat[]cats, Plate plate, int addFood){
        for (Cat cat : cats) {
            cat.eat(plate);
            while (!cat.isSatiety()) {
                plate.setFood(addFood);
                cat.eat(plate);
            }
        }
    }
}
