package org.itmo.java.lesson3.homework3;

import org.itmo.java.lesson2.Color;

public class SomeClass {
    Color color;
    String name;
    Integer weight;

    public SomeClass(Integer weight) {
        this.color = Color.UNKNOWN;
        this.name = "Имя неизвестно";
        this.weight = weight;
    }

    public SomeClass(Color color, Integer weight) {
        this.color = color;
        this.name = "Имя неизвестно";
        this.weight = weight;
    }

    public SomeClass() {
        this.color = Color.UNKNOWN;
        this.name = "Имя неизвестно";
        this.weight = 0;
    }

    public String printInformation() {
        return "Цвет: " + color + ", имя: " + name + ", вес: " + weight + " кг.";
    }

}