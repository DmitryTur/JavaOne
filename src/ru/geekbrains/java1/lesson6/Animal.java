package ru.geekbrains.java1.lesson6;


public class Animal {

    protected int maxRunDistance;
    protected double maxHeight;
    protected double maxSwimDistance;
    protected String name;

    public Animal(int maxRunDistance, double maxHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxHeight = maxHeight;
    }

    public Animal(int maxRunDistance, double maxHeight, double maxSwimDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxHeight = maxHeight;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run (int distance) {

    }

    public void jump (double height) {

    }

    public void swim (double distance) {

    }

}
