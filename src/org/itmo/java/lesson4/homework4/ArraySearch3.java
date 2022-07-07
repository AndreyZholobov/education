package org.itmo.java.lesson4.homework4;

public class ArraySearch3 {
/*
5.	Напишите программу, чтобы проверить, появляется ли число 3 как первый или последний элемент массива целых чисел.
Длина массива должна быть больше или равна двум. Пример вывода:
array = 3, -3, 7, 4, 5, 4, 3
true
*/

    public static void arraySearch() {
        int[] myArray;
        myArray = ArrayGenerate.arrayGenerate();
        System.out.println("result: " + ((myArray[0] == 3) || (myArray[myArray.length - 1] == 3)));
    }
}
