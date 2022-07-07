package org.itmo.java.lesson4.homework4;

public class OddNumbers {

    public static void oddNumbers() {
        System.out.println("Задание 1");
        System.out.println("Нечетные числа от 1 до 99");
//        1.	Напишите программу, которая выводит на консоль нечетные числа от 1 до 99.
//        Каждое число печатается с новой строки.
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

}
