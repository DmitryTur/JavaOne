package ru.geekbrains.java1.lesson6;

public class AnimalsApp {
    public static void main(String[] args) {
        Cat cat = new Cat(400,2);
        Dog dog = new Dog(600,0.5,10.0);
        Dog dog1 = new Dog(400,0.3,8.0);
        cat.run(399);
        cat.jump(3);
        dog.run(599);
        dog.swim(9);
        dog.jump(0.2);
        dog1.run(400);
        dog1.swim(9.0);
        dog1.jump(0.5);
    }
}

