package org.itmo.java.lesson3.homework3;

import org.itmo.java.lesson2.Color;

public class someClass {
    Color color;
    String name;
    Integer weight;

    public someClass(Integer weight) {
        this.color = Color.UNKNOWN;
        this.name = "Имя неизвестно";
        this.weight = weight;
    }

    public someClass(Color color, Integer weight) {
        this.color = color;
        this.name = "Имя неизвестно";
        this.weight = weight;
    }

    public someClass() {
        this.color = Color.UNKNOWN;
        this.name = "Имя неизвестно";
        this.weight = 0;
    }

    public String printInformation() {
        return "Цвет: " + color + ", имя: " + name + ", вес: " + weight + " кг.";
    }

}