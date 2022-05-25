package ru.geekbrains.sharov.lesson1;

public class HomeWorkApp { // Задание 1

    public static void main (String [] args){
        PrintThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
    public static void PrintThreeWords() { // Задание 2
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }
    public static void checkSumSign() { // Задание 3
        int a = 400;
        int b = 4;
        int c = a + b;
        if (c<0) {
            System.out.println("Сумма отрицательная");
        }
        if (c>=0){
            System.out.println("Сумма положительная");
        }

    }
    public static void printColor(){ // Задание 4
        int value = 101;

        if ( value <= 0 ){ //value меньше 0 (0 включительно), то “Красный”
        System.out.println("Красный");

        }
        if ( 0 < value && value <= 100 ){ //если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”
            System.out.println("Желтый");
        }
        if (value > 100){ //если больше 100 (100 исключительно) - “Зеленый”
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){ // Задание 5
        int a = 26;
        int b = 25;
        if (a >= b){ //Если a больше или равно b, то выводится “a >= b”
            System.out.println("a >= b");
        }
            else { //в противном случае “a < b”
                System.out.println( "a < b" );
            }
    }
}
