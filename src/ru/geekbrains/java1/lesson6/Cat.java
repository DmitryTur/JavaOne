package ru.geekbrains.java1.lesson6;

public class Cat extends Animal {

    public Cat(int maxRunDistance, double maxHeight) {
        super(maxRunDistance, maxHeight);
    }

    @Override
    public void run(int distance) {
        super.run(distance);
        System.out.println("Cat run: " + (maxRunDistance > distance));
    }

    @Override
    public void jump(double height) {
        super.jump(height);
        System.out.println("Cat jump: " + (maxHeight > height));
    }
}
