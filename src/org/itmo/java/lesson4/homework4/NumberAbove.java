package org.itmo.java.lesson4.homework4;

/*
4.	Напишите программу, которая принимает от пользователя три целых числа и возвращает true,
 если второе число больше первого числа, а третье число больше второго числа. Пример вывода:
Введите первое число: 5
Введите второе число: 10
Введите третье число: 15
Результат: true
 */
public class NumberAbove {
    public static void numberAbove(int a, int b, int c) {
        System.out.println(c > b && b > a);
    }
}
