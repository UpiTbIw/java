package ru.geekbrains.sharov.Lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];  // Создать массив из 5 сотрудников
        employeeArray[0] = new Employee("Podobedov A.V.", "Chief", "podobedov@mail.ru", "1111111", 100000, 45);
        employeeArray[1] = new Employee("Plestcova E.V.", "Engineer", "Plestcova@mail.ru", "2222222", 90000, 42);
        employeeArray[2] = new Employee("Fabrina O.A.", "Specialist", "Fabrina@mail.ru", "3333333", 80000, 37);
        employeeArray[3] = new Employee("Dibov S.S.", "Engineer", "Dibov@mail.ru", "4444444", 85000, 33);
        employeeArray[4] = new Employee("Nechaev P.N.", "Safaty-Chief", "Nechaev@mail.ru", "5555555", 38000, 59);

        for (int i = 0; i < employeeArray.length; i++) { //С помощью цикла вывести информацию только о сотрудниках старше 40 лет
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].print();
            }
        }
    }
}
