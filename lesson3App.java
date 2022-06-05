package ru.geekbrains.sharov.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class lesson3App {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
    }

    private static void Task1() {
        int[] arr = {0, 1, 1, 0, 0, 1, 1, 1, 0, 1};
        System.out.println(Arrays.toString(arr));
        int arrll = arr.length;
        for (int i = 0; i < arrll; i++) {
            if (arr[i] == 1) arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void Task2() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void Task3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int newarr = arr.length;
        for (int i = 0; i < newarr; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void Task4() {
        int[][] table = new int[10][10];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i == j) {
                table[i][j] = 1;
                }
                 if (i != j) {
                    table [i][j] = 0;
                 }
            }
            System.out.println(Arrays.toString(table[i]));
        }
    }
    public static void Task5() {
        System.out.println("Введите длину массива");
        Scanner len = new Scanner(System.in);
        int i;
        i = len.nextInt();
        System.out.println("Введите значения в массиве");
        Scanner initialValue = new Scanner(System.in);
        int j;
        j =  initialValue.nextInt();
        int[] table = new int[i];
        for (i = 0; i < table.length; i ++){
            table[i] = j;
        }
        System.out.println(Arrays.toString(table));

    }
}
