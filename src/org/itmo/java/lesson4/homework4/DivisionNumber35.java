package org.itmo.java.lesson4.homework4;

public class DivisionNumber35 {
    public static void divisionNumber35() {
        //2.	Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое
        // (то есть и на 3 и на 5).
        System.out.println("Делится на 3");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();
        System.out.println("Делится на 5");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();
        System.out.println("Делится на 3 и 5");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

}
