package ru.geekbrains.java1.lesson5;

/**
 * * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 * * Конструктор класса должен заполнять эти поля при создании объекта;
 * * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
 * * Создать массив из 5 сотрудников
 * * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 */

public class Employee {

    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, String position, String email, String phone, int salary, int age) {


        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void showEmployee() {
        System.out.println(String.format("Name: %s / Position: %s / Email: %s / Phone: %s / Salary: %d / Age: %d", this.name, this.position, this.email, this.phone, this.salary, this.age));
    }
}


