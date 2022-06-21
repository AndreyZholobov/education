package org.itmo.java.lesson1;

import java.util.Scanner;

public class lesson1 {
    public static void main(String[] args) {
        // задание 1
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        // Задание 2
        double d = (46 + 10) * ((double) 10 / 3);
        int s = (29) * (4) * (-15);

        System.out.println("d = " + d);
        System.out.println("s = " + s);

        // Задание 3
        int number = 10500;
        double result = ((double) number / 10) / 10;
        System.out.println("result = " + result);

        // Задание 4
        //Даны три числа: 3.6, 4.1, 5.9. В переменной result посчитайте произведение этих чисел.
        double numb1 = 3.6;
        double numb2 = 4.1;
        double numb3 = 5.9;
        double res = numb1 * numb2 * numb3;
        System.out.println("res = " + res);

        // Задание 5
        /* В этой задаче вы должны считать целые числа из стандартного ввода, а затем вывести. Каждое
        целое число нужно печатать с новой строки. Формат ввода:
        42
        100
        125
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите три числа:");
        int str1 = scanner.nextInt();
        int str2 = scanner.nextInt();
        int str3 = scanner.nextInt();
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        // Задание 6
        /*
        Для целого числа b выполните следующие условные действия:
        Если b нечетное, выведите “Нечетное”
        Если b четное, выведите “Четное”
        Если b четное и больше 100, выведите “”
        */

        System.out.println("введите число:");
        int b = scanner.nextInt();

        if (b % 2 == 0 && b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else if (b % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }

    }
}
