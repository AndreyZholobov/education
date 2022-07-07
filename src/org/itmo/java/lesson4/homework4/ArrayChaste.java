package org.itmo.java.lesson4.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChaste {


    /*
    1.	Напишите программу, которая проверяет отсортирован ли массив по возрастанию. Если он отсортирован по
    возрастанию то выводится “OK”, если нет, то будет выводиться текст “Please, try again”
    */
    public static String arraySorted() {
        int[] myArray;
        myArray = ArrayGenerate.arrayGenerate();
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > myArray[i + 1])
                return "Please, try again";
        }
        return "ok";
    }

    /*
    2.	Напишите программу, которая считывает с клавиатуры длину массива (например, пользователь вводит цифру 4),
     затем пользователь вводит 4 числа и на новой строке выводится массив из 4 элементов. Пример вывода:
    Array length: 4
    Numbers of array:
    5
    6
    7
    2
    Result: [5, 6, 7, 2]
     */

    public static String inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int length = scanner.nextInt();
        int[] myArray = new int[length];
        System.out.println("Введите числа массива");
        for (int i = 0; i < length; i++) {
            myArray[i] = scanner.nextInt();
        }
        return Arrays.toString(myArray);
    }

/*
3.	Напишите метод, который меняет местами первый и последний элемент массива. Пример вывода:
Array 1: [5, 6, 7, 2]
Array 2: [2, 6, 7, 5]
*/

    public static String numberSubstitution() {
        int tempNumber;
        int[] myArray;
        myArray = ArrayGenerate.arrayGenerate();
        if (myArray[0] != myArray[myArray.length - 1]) {
            tempNumber = myArray[myArray.length - 1];
            myArray[myArray.length - 1] = myArray[0];
            myArray[0] = tempNumber;
            return "Array : " + Arrays.toString(myArray);
        } else {
            return "Первое и последнее число в массиве - одинаковое!";
        }
    }


    /*
    4.	Дан массив чисел. Найдите первое уникальное в этом массиве число.
    Например, для массива [1, 2, 3, 1, 2, 4] это число 3.
     */
    public static int numberUniq() {
        int[] myArray;
        myArray = ArrayGenerate.arrayGenerate();
        for (int i = 0; i < myArray.length; i++) {
            boolean flag = true;
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] == myArray[j] && i != j) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return myArray[i];
            }
        }
        return 0;
    }
}