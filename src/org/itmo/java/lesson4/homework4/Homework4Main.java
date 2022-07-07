package org.itmo.java.lesson4.homework4;

import java.util.Scanner;

public class Homework4Main {
    public static void main(String[] args) {
        OddNumbers.oddNumbers();

        System.out.println("Задание 2");
        DivisionNumber35.divisionNumber35();

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите три числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Задание 3");
        SumNumbers.sumNumber(a, b, c);

        System.out.println("Задание 4");
        NumberAbove.numberAbove(a, b, c);

        System.out.println("Задание 5");
        ArraySearch3.arraySearch();

        System.out.println("Задание 6");
        CheckNumber.chekNumber();

        System.out.println("Часть 2");
        System.out.println("Задание 1");
        System.out.println(ArrayChaste.arraySorted());

        System.out.println("Задание 2");
        System.out.println(ArrayChaste.inputArray());

        System.out.println("Задание 3");
        System.out.println(ArrayChaste.numberSubstitution());

        System.out.println("Задание 4");
        System.out.println(ArrayChaste.numberUniq());

        System.out.println("сортировка слиянием сделана в org.itmo.java.lesson4");
        System.out.println("Прочитать - главы 1-4 Грокаем алгоритмы");

    }
}