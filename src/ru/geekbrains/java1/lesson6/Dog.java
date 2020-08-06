package ru.geekbrains.java1.lesson6;

public class Dog extends Animal {
    public Dog(int maxRunDistance, double maxHeight, double maxSwimDistance) {
        super(maxRunDistance, maxHeight, maxSwimDistance);
    }

    @Override
    public void run(int distance) {
        super.run(distance);
        System.out.println("Dog run: " + (maxRunDistance > distance));
    }

    @Override
    public void jump(double height) {
        super.jump(height);
        System.out.println("Dog jump: " + (maxHeight > height));
    }

    @Override
    public void swim(double distance) {
        super.swim(distance);
        System.out.println("Dog swim: " + (maxSwimDistance > distance));
    }
}
