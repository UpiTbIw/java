package ru.geekbrains.sharov.Lesson5;

public class Employee { //Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    public String fullname;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    public int getAge() { // Необходимо для 5 задания
        return age;
    }

    // Конструктор класса должен заполнять эти поля при создании объекта
    public Employee(String fullname, String position, String email, String phoneNumber, int salary, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    //Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в
    //консоль
    public void print() {
        System.out.println("Name: " + fullname + " | " + " Position: " + position + " | " + " email: " + email + " | " +
                " PhoneNumber: " + phoneNumber + " | " + " Salary: " + salary + " | " + " Age: " + age);

    }
}
