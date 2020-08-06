package ru.geekbrains.java1.lesson5;



public class Main {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Vasya", "Welder", "vasya155@google.com", "89464753215", 30000, 45);
        persArray[1] = new Employee("Petya", "Idler", "petka@google.com", "89564731415", 15000, 28);
        persArray[2] = new Employee("Nikolay", "Director", "nikolaboss@google.com", "89776667777", 150000, 52);
        persArray[3] = new Employee("Anastasia", "Accountant", "nastyachika@google.com", "89464758976", 45000, 30);
        persArray[4] = new Employee("Max", "programmer", "makscoolguy@google.com", "84955553311", 149999, 30);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40)
                persArray[i].showEmployee();
        }
    }
}
