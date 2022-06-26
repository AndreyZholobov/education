package org.itmo.java.lesson2.homework2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Первая часть");
        int s = Calculator.summ(27, 36);
        int e = Calculator.extr(26, 19);
        double m = Calculator.Multiply(26, 50.0);
        double d1 = Calculator.div(569L, 785);
        double d2 = Calculator.div(50, 2);
        double d3 = Calculator.div(36.89, 9.4);
        System.out.println("Суммирование");
        System.out.println(s);
        System.out.println("вычитание");
        System.out.println(e);
        System.out.println("Умножение");
        System.out.println(m);
        System.out.println("Деление");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println("Вторая часть");
        Student student = new Student("somename", "somesername", "somemid", 1, 100);
        System.out.println(student);
        Student student1 = new Student();
        System.out.println(student1);
    }
}
