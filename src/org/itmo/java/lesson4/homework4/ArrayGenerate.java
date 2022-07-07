package org.itmo.java.lesson4.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayGenerate {

    public static int[] arrayGenerate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива:");
        int lengthy = scanner.nextInt();
        int[] myArray;
        myArray = new int[lengthy];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 100);
        }
        //myArray[lengthy-1] = 3;
        System.out.println(Arrays.toString(myArray));
        return myArray;
    }
}
