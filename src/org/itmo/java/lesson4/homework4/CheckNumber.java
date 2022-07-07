package org.itmo.java.lesson4.homework4;

//6.	Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
public class CheckNumber {
    public static void chekNumber() {
        int[] myArray;
        myArray = ArrayGenerate.arrayGenerate();
        for (int j : myArray) {
            if (j == 1 || j == 3) {
                System.out.println("массив содержит число 1 или 3");
                break;
            }
        }
    }

}
